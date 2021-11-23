@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/register").permitAll().antMatchers("/resources/**").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/").permitAll().and().logout().permitAll().and().exceptionHandling().accessDeniedPage("/");
}