@java.lang.Override
public boolean isUserInRole(java.lang.String role) {
    java.lang.String roleUser = user.getUserRole().get(0).getRole();
    return role.equals(roleUser);
}