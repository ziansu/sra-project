@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/", "/login.html", "/api/sampleentity").permitAll().anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll().logoutUrl("/logout").logoutSuccessUrl("/");
}