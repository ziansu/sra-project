public boolean doesUsernameExist(java.lang.String username) {
    try {
        if ((findByUsername(username)) != null)
            return true;
        
        return false;
    } catch (java.lang.Exception ex) {
        return false;
    }
}