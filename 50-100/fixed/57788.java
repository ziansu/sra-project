@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/api/sampleentity").authenticated().and().authorizeRequests().and().formLogin().permitAll().and().logout().permitAll().logoutUrl("/logout").logoutSuccessUrl("/");
}