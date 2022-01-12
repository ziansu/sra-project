@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll();
    http.authorizeRequests().antMatchers("/webjars/**", "/swagger-ui.html", "/swagger-resources", "/v2/api-docs", "/admin/**").permitAll();
    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests().anyRequest().authenticated();
}