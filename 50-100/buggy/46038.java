@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/resources/**").permitAll().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll().and().exceptionHandling().accessDeniedPage("/403").and().csrf().disable();
}