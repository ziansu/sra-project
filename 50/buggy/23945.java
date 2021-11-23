@org.springframework.web.bind.annotation.RequestMapping(value = "/contacts")
public org.springframework.web.servlet.ModelAndView contacts() {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("contacts_list");
    return modelAndView;
}