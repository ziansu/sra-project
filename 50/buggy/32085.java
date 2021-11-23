@org.springframework.context.annotation.Bean
public org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider() {
    org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider = new org.springframework.security.authentication.dao.DaoAuthenticationProvider();
    authenticationProvider.setUserDetailsService(userDetailsService);
    authenticationProvider.setPasswordEncoder(passwordEncoder());
    return authenticationProvider;
}