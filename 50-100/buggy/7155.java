@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll().and().logout().permitAll();
    http.addFilterBefore(myFilterSecurityInterceptor, org.springframework.security.web.access.intercept.FilterSecurityInterceptor.class);
}