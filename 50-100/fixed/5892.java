@com.vizaco.onlinecontrol.controller.RequestMapping(value = "/registration", method = RequestMethod.POST)
public java.lang.String saveUser(@com.vizaco.onlinecontrol.controller.ModelAttribute(value = "user")
@javax.validation.Valid
@org.springframework.validation.annotation.Validated
com.vizaco.onlinecontrol.model.User user, org.springframework.validation.BindingResult result, javax.servlet.http.HttpServletRequest request) throws java.io.IOException {
    if (result.hasErrors()) {
        return "/auth/registration";
    }
    userService.saveUser(user);
    com.vizaco.onlinecontrol.model.User principal = ((com.vizaco.onlinecontrol.model.User) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
    return "redirect:/users/account/" + (principal.getLogin());
}