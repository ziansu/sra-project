public void setPassword(java.lang.String password) {
    if (password != null) {
        org.springframework.security.crypto.password.PasswordEncoder encoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }else
        this.password = null;
    
}