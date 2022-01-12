@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView login(@org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
java.lang.String error, @org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
java.lang.String logout, @org.springframework.web.bind.annotation.RequestParam(value = "registered", required = false)
java.lang.String registered) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    if (error != null) {
        model.addObject("error", error);
    }
    if (logout != null) {
        model.addObject("msg", logout);
    }
    if (registered != null) {
        model.addObject("registered", true);
    }
    model.setViewName("login");
    return model;
}