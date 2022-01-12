private boolean validatePassword(java.lang.String password, java.lang.String repassword) {
    if (!(password.equals(repassword))) {
        return false;
    }else
        if ((password.trim().equals("")) || (password.trim().equals(""))) {
            return false;
        }
    
    return true;
}