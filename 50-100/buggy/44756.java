@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.httpBasic().realmName("tasker").and().cors().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().requestMatchers().antMatchers("/oauth/authorize").and().authorizeRequests().antMatchers("/oauth/authorize").authenticated();
}