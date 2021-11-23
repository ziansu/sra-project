@ru.drv.controllers.PostMapping(value = "/user")
public java.lang.String update(@ru.drv.controllers.ModelAttribute(value = "userForm")
ru.drv.models.User user) {
    userService.update(user.getId(), user);
    return "redirect:/user/" + (user.getId());
}