protected void parseRowsetRoles(java.lang.String name) {
    roles = name.equals("roles");
    grantableRoles = name.equals("grantableRoles");
    rolesAtHQ = name.equals("rolesAtHQ");
    grantableRolesAtHQ = name.equals("grantableRolesAtHQ");
    rolesAtBase = name.equals("rolesAtBase");
    grantableRolesAtBase = name.equals("grantableRolesAtBase");
    rolesAtOther = name.equals("rolesAtOther");
    grantableRolesAtOther = name.equals("grantableRolesAtOther");
}