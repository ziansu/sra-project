@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth, org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) throws java.lang.Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
}