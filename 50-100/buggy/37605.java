public java.util.List<java.lang.String> getRoles(java.lang.String role) {
    java.util.List<java.lang.String> roles = new java.util.ArrayList<java.lang.String>();
    if (role.equalsIgnoreCase("Recruiter")) {
        roles.add("ROLE_RECRUITER");
    }else
        if (role.equalsIgnoreCase("Candidate")) {
            roles.add("ROLE_CANDIDATE");
        }else
            if (role.equalsIgnoreCase("Trainer")) {
                roles.add("ROLE_TRAINER");
            }
        
    
    return roles;
}