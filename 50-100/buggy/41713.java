@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/api/v1/**").hasRole("USER").antMatchers(HttpMethod.POST, "/api/v1/rooms").hasRole("ADMIN").anyRequest().authenticated().and().httpBasic().and().csrf().disable();
}