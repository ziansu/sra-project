@com.imcode.controllers.html.RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView updateForm(@com.imcode.controllers.html.PathVariable(value = "id")
com.imcode.entities.User user, org.springframework.web.servlet.ModelAndView model, org.springframework.web.context.request.WebRequest webRequest, java.util.Locale locale) {
    if (user == null) {
        model.setViewName("clients/list");
        throw new com.imcode.controllers.html.exceptions.NotFoundException();
    }
    model.setViewName("users/edit");
    model.addObject(user);
    model.addObject(roleService.findAll());
    return model;
}