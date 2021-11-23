@quarkbrothBlog.controller.GetMapping(value = "/profile/edit/{id}")
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
public java.lang.String profileEdit(org.springframework.ui.Model model, @quarkbrothBlog.controller.PathVariable
java.lang.Integer id) {
    if (!(this.userRepository.exists(id))) {
        return "redirect:/";
    }
    quarkbrothBlog.entity.User user = this.userRepository.findOne(id);
    if (!(isAdminOrMe(user))) {
        return "redirect:/";
    }
    model.addAttribute("user", user);
    model.addAttribute("view", "user/edit");
    return "base-layout";
}