@org.springframework.web.bind.annotation.RequestMapping(path = "/test", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String testParse(org.springframework.ui.ModelMap map, javax.servlet.http.HttpSession session) {
    cat.testQuestionCategory();
    return "resources/pages/RevatureTemplate.html";
}