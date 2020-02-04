package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/sumMoney")
	public String sumMoney(Integer item1, Integer item2, Integer item3) {

		Integer sum= item1+item2+item3;
		
		application.setAttribute("taxIncluded", sum*1.1);

		application.setAttribute("withoutTax", sum);

		return "exam03-result";
	}

}