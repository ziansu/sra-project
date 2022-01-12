@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.requestMatchers().antMatchers("/sso/me/**", "/sso/internal/**", "/settings/**", "/api-docs/**").and().authorizeRequests().antMatchers("/settings/**").hasRole("ADMINISTRATOR").antMatchers("/sso/internal/**").hasRole("INTERNAL").anyRequest().authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
}