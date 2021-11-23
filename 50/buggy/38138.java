public void setPassword(java.lang.String password) {
    if ((password.length()) > 8)
        this.password = password;
    else
        this.password = null;
    
}