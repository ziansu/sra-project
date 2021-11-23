@org.springframework.security.access.prepost.PreAuthorize(value = "@userTasksHelperServiceImpl.canAccessUser(principal, #userName)")
@org.springframework.web.bind.annotation.RequestMapping(value = { "/viewUser/{userName}" , "/admin/viewUser/{userName}" })
public java.lang.String getUserProfilePage(@org.springframework.web.bind.annotation.PathVariable(value = "userName")
java.lang.String userName, org.springframework.ui.Model model, org.springframework.security.core.Authentication authentication) {
    com.fithub.controller.UserTasksController.LOG.debug("Retreiving the profile of user={}", userName);
    com.fithub.domain.User user = userService.getUserByUsername(userName);
    if (user != null) {
        com.fithub.domain.UserDTO userDTO = userTasksHelperService.populateUserDTOFromUser(user);
        model.addAttribute("userDTO", userDTO);
    }else
        throw new java.util.NoSuchElementException(java.lang.String.format("Username=%s not found", userName));
    
    com.fithub.controller.UserTasksController.LOG.debug("Profile page to be invoked");
    return "user/profile";
}