public static org.owasp.dependencytrack.model.Roles.ROLE getRole(java.lang.String roleName) {
    for (org.owasp.dependencytrack.model.Roles.ROLE role : org.owasp.dependencytrack.model.Roles.ROLE.values()) {
        if ((roleName != null) && (role.name().equalsIgnoreCase(roleName))) {
            return role;
        }
    }
    return null;
}