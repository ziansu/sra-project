@java.lang.Override
protected void initEditAttributes(by.pvt.module3.entity.User user, org.springframework.ui.Model model) {
    model.addAttribute(by.pvt.module3.command.user.UserCommand.LIST_USER_ROLE, userRoleService.getAll());
}