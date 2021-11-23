public java.util.List<java.lang.String> getRoles(java.lang.String role) {
    java.util.List<java.lang.String> roles = new java.util.ArrayList<java.lang.String>();
    if ("Recruiter".equalsIgnoreCase(role)) {
        roles.add("ROLE_RECRUITER");
    }else
        if ("Candidate".equalsIgnoreCase(role)) {
            roles.add("ROLE_CANDIDATE");
        }else
            if ("Trainer".equalsIgnoreCase(role)) {
                roles.add("ROLE_TRAINER");
            }
        
    
    return roles;
}