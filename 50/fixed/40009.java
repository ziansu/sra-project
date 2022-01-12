@org.springframework.web.bind.annotation.RequestMapping(value = { "/" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView defaultPage() {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    model.setViewName("index");
    return model;
}