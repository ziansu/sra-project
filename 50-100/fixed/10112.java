public boolean authenticate(final java.lang.String iUserName, final java.lang.String iPassword, final java.lang.String iResourceToCheck) {
    final com.orientechnologies.orient.server.config.OServerUserConfiguration user = getUser(iUserName);
    if ((user != null) && (user.password.equals(iPassword))) {
        if (user.resources.equals("*"))
            return true;
        
        java.lang.String[] resourceParts = user.resources.split(",");
        for (java.lang.String r : resourceParts)
            if (r.equals(iResourceToCheck))
                return true;
            
        
    }
    return false;
}