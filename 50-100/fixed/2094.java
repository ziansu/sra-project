@todolist.controllers.PostMapping(value = "/signup")
public java.lang.String signup(@javax.validation.Valid
@todolist.controllers.ModelAttribute
todolist.entities.User user, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (result.hasErrors()) {
        redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.user", result);
        redirectAttributes.addFlashAttribute(user);
        return "redirect:/signup";
    }else {
        userService.addUser(user);
        java.lang.String signupSuccessMsg = messageSource.getMessage("Registration.success", new java.lang.String[]{ user.getUsername() }, java.util.Locale.ENGLISH);
        redirectAttributes.addFlashAttribute("message", signupSuccessMsg);
        return "redirect:/login";
    }
}