@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/sign-up**").anonymous().anyRequest().hasRole("USER").and().formLogin().loginPage("/login").defaultSuccessUrl("/", true).permitAll().and().rememberMe();
}