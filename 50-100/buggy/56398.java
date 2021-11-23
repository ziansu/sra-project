private void fillModel(org.springframework.ui.Model model, org.springframework.security.core.userdetails.UserDetails user, kr.ac.kaist.se.tardis.web.form.SetUserForm userForm) {
    model.addAttribute("username", java.lang.String.valueOf(user.getUsername()));
    model.addAttribute("notificationList", notificationService.getNotificationsForUser(user.getUsername()));
    model.addAttribute("userForm", userForm);
}