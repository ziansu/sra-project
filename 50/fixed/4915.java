@java.lang.Override
protected void configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    super.configure(auth);
    auth.parentAuthenticationManager(digestAuthenticationManager());
    auth.eraseCredentials(true);
}