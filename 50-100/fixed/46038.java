@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").and().formLogin().loginPage("/login").and().logout().and().exceptionHandling().accessDeniedPage("/403").and().csrf().disable();
}