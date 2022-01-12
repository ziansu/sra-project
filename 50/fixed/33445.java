@org.springframework.web.bind.annotation.RequestMapping(value = "/registration", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView registration(ru.pelmegov.javashop.model.user.User user, @org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
java.lang.String error) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView(registrationView);
    return model;
}