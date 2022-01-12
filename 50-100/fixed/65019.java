@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/**").permitAll().and().formLogin().loginPage("/login").defaultSuccessUrl("/", true).failureUrl("/login?error").permitAll().and().logout().permitAll();
    http.csrf().disable();
}