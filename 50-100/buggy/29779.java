private java.util.Collection<java.lang.String> getRoleNamesForGroups(java.util.Collection<java.lang.String> groupNames) {
    java.util.Collection<java.lang.String> roles = new java.util.ArrayList<>();
    for (java.lang.String group : groupNames) {
        java.util.Collection<java.lang.String> rolesForGroup = groupToRoleMapping.get(group);
        if (rolesForGroup != null) {
            roles.addAll(rolesForGroup);
        }
    }
    return roles;
}