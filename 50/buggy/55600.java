@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/", "/*", "/**", "/quote", "/home", "/validate", "topics", "counter", "chat").permitAll().anyRequest().authenticated();
}