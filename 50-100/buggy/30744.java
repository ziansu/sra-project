@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().disable().authorizeRequests().antMatchers("/", "/login", "/general/**").permitAll().anyRequest().authenticated().and().formLogin().failureHandler(authenticationFailureHandler()).successHandler(authenticationSuccessHandler()).loginPage("/login").and().logout().logoutSuccessHandler(logoutSuccessHandler()).permitAll();
}