protected void parseRowsetRoles(java.lang.String name) {
    roles = "roles".equals(name);
    grantableRoles = "grantableRoles".equals(name);
    rolesAtHQ = "rolesAtHQ".equals(name);
    grantableRolesAtHQ = "grantableRolesAtHQ".equals(name);
    rolesAtBase = "rolesAtBase".equals(name);
    grantableRolesAtBase = "grantableRolesAtBase".equals(name);
    rolesAtOther = "rolesAtOther".equals(name);
    grantableRolesAtOther = "grantableRolesAtOther".equals(name);
}