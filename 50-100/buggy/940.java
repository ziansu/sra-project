@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView login(@org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
boolean error, @org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
boolean logout, @org.springframework.web.bind.annotation.RequestParam(value = "registered", required = false)
boolean registered) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    if (error) {
        model.addObject("error", true);
    }
    if (logout) {
        model.addObject("msg", true);
    }
    if (registered) {
        model.addObject("registered", true);
    }
    model.setViewName("login");
    return model;
}