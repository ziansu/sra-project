@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/#/participants").hasAuthority("ROLE_MANAGER").antMatchers("/**").authenticated().and().formLogin().permitAll().and().logout().permitAll();
}