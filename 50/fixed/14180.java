@org.innovateuk.ifs.commons.security.PermissionRule(value = "ACCESS_USER_EDIT", description = "Only active users can be edited")
public boolean activeUsersCanBeEdited(java.lang.Long userId, org.innovateuk.ifs.user.resource.UserResource user) {
    org.innovateuk.ifs.user.resource.UserResource editUser = userService.findById(userId);
    return (user != null) && (UserStatus.ACTIVE.equals(editUser.getStatus()));
}