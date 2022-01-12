private boolean validatePassword(java.lang.String password, java.lang.String repassword) {
    if ((password == null) || (repassword == null)) {
        return false;
    }else
        if (!(password.equals(repassword))) {
            return false;
        }else
            if (password.trim().isEmpty()) {
                return false;
            }
        
    
    return true;
}