@ua.nure.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView index() {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("index");
    return model;
}