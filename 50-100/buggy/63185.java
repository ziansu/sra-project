public java.util.List<java.lang.String> getRoles(java.lang.Integer role) {
    java.util.List<java.lang.String> roles = new java.util.ArrayList<java.lang.String>();
    if ((role.intValue()) == 1) {
        roles.add("ROLE_USER");
        roles.add("ROLE_ADMIN");
    }else
        if ((role.intValue()) == 2) {
            roles.add("ROLE_USER");
        }
    
    return roles;
}