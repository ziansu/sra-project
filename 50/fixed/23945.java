@org.springframework.web.bind.annotation.RequestMapping(value = "/contacts")
public org.springframework.web.servlet.ModelAndView contacts() {
    return new org.springframework.web.servlet.ModelAndView("contacts_list");
}