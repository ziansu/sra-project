protected java.util.Set<java.lang.String> getRoleNamesForUser(java.sql.Connection conn, java.lang.String username) throws java.sql.SQLException {
    final java.util.Set<java.lang.String> roleNames = super.getRoleNamesForUser(conn, username);
    final org.owasp.dependencytrack.model.Roles.ROLE defaultRole = org.owasp.dependencytrack.Config.getInstance().getDefaultRole();
    if (((roleNames.size()) == 0) && (defaultRole != (Roles.ROLE.NONE))) {
        roleNames.add(defaultRole.name().toLowerCase());
    }
    return roleNames;
}