@org.springframework.web.bind.annotation.PostMapping(value = { "/userSave" , "/admin/userSave" }, params = "userRegister")
public java.lang.String submitUserRegisterPage(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "userDTO")
com.fithub.domain.UserDTO userDTO, org.springframework.validation.BindingResult result, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes, org.springframework.security.core.Authentication authentication) {
    com.fithub.controller.UserRegisterController.LOG.debug("Attempting to register user", userDTO.getUserName());
    userRegisterValidator.validate(userDTO, result);
    if (result.hasErrors()) {
        com.fithub.controller.UserRegisterController.LOG.debug("Errors in the submitted form");
        return "user/registration";
    }
    userService.createUser(userDTO);
    com.fithub.controller.UserRegisterController.LOG.debug("Registration successful, heading to the jsp");
    redirectAttributes.addFlashAttribute("userRegisterSuccess", true);
    if (authentication != null)
        return "redirect:/admin/userTaskSuccess";
    else
        return "redirect:/userTaskSuccess";
    
}