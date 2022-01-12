@org.springframework.web.bind.annotation.RequestMapping(path = "welcome.do", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getHomePage(org.springframework.ui.Model model) {
    return "home";
}