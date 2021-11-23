@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ADMIN')")
@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/userTask/{userName}", params = "userDelete")
public java.lang.String handleUserDelete(@org.springframework.web.bind.annotation.PathVariable(value = "userName")
java.lang.String userName, @org.springframework.web.bind.annotation.ModelAttribute(value = "userDTO")
com.fithub.domain.UserDTO userDTO, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    com.fithub.controller.UserTasksController.LOG.debug("Attempting to delete user={}", userDTO.getUserName());
    boolean isUserDelete = userService.deleteUserByUsername(userDTO.getUserName());
    com.fithub.controller.UserTasksController.LOG.debug("User was delete successfuly ?={}", isUserDelete);
    redirectAttributes.addFlashAttribute("userDeleteSuccess", true);
    return "redirect:/admin/userTaskSuccess";
}