@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/").authenticated();
    http.formLogin().loginPage("/login").failureUrl("/login?error").usernameParameter("login").passwordParameter("password").and().logout().logoutSuccessUrl("/login?logout").and().csrf().and().exceptionHandling().accessDeniedPage("/403");
}