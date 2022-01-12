public java.util.List<java.lang.String> getStripRoleNames() {
    java.util.List<java.lang.String> roles = getRoles();
    java.util.List<java.lang.String> stripRoleNames = new java.util.ArrayList<>(roles.size());
    for (java.lang.String role : roles) {
        stripRoleNames.add(stripRolePrefix(role));
    }
    return stripRoleNames;
}