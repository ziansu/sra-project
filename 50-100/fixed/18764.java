@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and().authorizeRequests().antMatchers("/hello").access("#oauth2.hasScope('read')").and().authorizeRequests().anyRequest().permitAll();
}