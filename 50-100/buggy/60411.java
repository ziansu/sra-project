@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    log.debug("Smart Cosmos Security enabled, all requests must be authorized and no login redirect is offered.");
    http.exceptionHandling().accessDeniedHandler(new net.smartcosmos.security.authentication.direct.DirectAccessDeniedHandler()).authenticationEntryPoint(new net.smartcosmos.security.authentication.direct.DirectUnauthorizedEntryPoint("/login")).and().antMatcher("/**").authorizeRequests().anyRequest().authenticated();
}