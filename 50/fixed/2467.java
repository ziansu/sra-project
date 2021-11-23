@java.lang.Override
protected void configure(final org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
}