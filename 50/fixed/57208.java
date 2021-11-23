@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    final org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider = new org.springframework.security.authentication.dao.DaoAuthenticationProvider();
    authenticationProvider.setUserDetailsService(userDetailsService);
    authenticationProvider.setPasswordEncoder(passwordEncoder());
    auth.authenticationProvider(authenticationProvider);
}