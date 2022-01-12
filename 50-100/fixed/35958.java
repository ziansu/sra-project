@by.htp.spring_tags.controller.RequestMapping(path = "/deletion", method = RequestMethod.POST)
public java.lang.String deleteUser(@by.htp.spring_tags.controller.RequestParam(value = "userId")
int userId, org.springframework.ui.Model model) {
    by.htp.spring_tags.domain.User user = userService.findUserById(userId);
    model.addAttribute("deletedUser", user.getLogin());
    userService.disableUser(user);
    model.addAttribute("users", userService.findAllByStatus(UserStatus.ACTIVE));
    return "users";
}