@com.springapp.mvc.controller.RequestMapping(value = { "/getAllUsers" , "/" }, method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getAllUsers() {
    int count = userDAO.getCount();
    return new org.springframework.web.servlet.ModelAndView("ViewList", "itemCount", count);
}