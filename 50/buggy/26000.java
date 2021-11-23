@java.lang.Override
public boolean isUserInRole(java.lang.String role) {
    java.lang.System.out.println("roles equal role");
    java.lang.String roleUser = user.getUserRole().get(0).getRole();
    java.lang.System.out.println(roleUser);
    return role.equals(roleUser);
}