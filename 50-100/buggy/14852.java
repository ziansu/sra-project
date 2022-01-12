@org.springframework.web.bind.annotation.PostMapping(value = { "/admin/userRoleChange" }, params = "userRoleChange")
public java.lang.String handleUserRoleChange(@org.springframework.web.bind.annotation.ModelAttribute(value = "userDTO")
com.fithub.domain.UserDTO userDTO, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    com.fithub.controller.UserTasksController.LOG.debug("Attempting to update Role of user={}", userDTO.getUserName());
    userService.updateUserProfile(userDTO);
    com.fithub.controller.UserTasksController.LOG.debug("User={} profile update successful,profile", userDTO.getUserName());
    redirectAttributes.addFlashAttribute("userRoleChangeSuccess", "enabled");
    return "redirect:/admin/userTaskSuccess";
}