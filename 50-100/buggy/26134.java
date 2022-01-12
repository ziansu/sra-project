@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.antMatcher("/**").csrf().disable().cors().and().authorizeRequests().antMatchers("/**", "/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs").permitAll().and().logout().logoutSuccessUrl("/");
}