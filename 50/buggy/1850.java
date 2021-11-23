public void setPassword(java.lang.String password) {
    org.springframework.security.crypto.password.PasswordEncoder encoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    this.password = encoder.encode(password);
}