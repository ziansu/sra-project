@org.springframework.web.bind.annotation.RequestMapping(value = { "/" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView defaultPage() {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    model.addObject("title", "Spring Security + Hibernate Example");
    model.addObject("message", "This is default page!");
    model.setViewName("index");
    return model;
}