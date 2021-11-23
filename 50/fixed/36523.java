@com.springapp.mvc.controller.RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView editUser(@com.springapp.mvc.controller.PathVariable
int id, @com.springapp.mvc.controller.ModelAttribute
com.springapp.mvc.model.User user) {
    user = userDAO.getById(id);
    return new org.springframework.web.servlet.ModelAndView("editForm", "userObject", user);
}