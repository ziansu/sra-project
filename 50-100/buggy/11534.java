@org.springframework.web.bind.annotation.RequestMapping(value = "/edit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
private java.lang.String saveUser(org.springframework.ui.Model model, @javax.validation.Valid
com.oreva.simpleweb.mvc.web.stubs.UserStub userStub, org.springframework.validation.Errors errors) {
    java.lang.String currentPage = "users/edit";
    java.lang.String nextPage = "redirect:/messages/result";
    if (errors.hasErrors()) {
        return currentPage;
    }
    com.oreva.simpleweb.mvc.entities.User user = userService.convertStubToEntity(userStub);
    userService.save(user);
    model.addAttribute("user", user);
    return nextPage;
}