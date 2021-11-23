@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showLoginForm(org.springframework.ui.Model model) {
    model.addAttribute("registrationMethod", adminSettings.getRegistrationMethod().toString());
    return "login";
}