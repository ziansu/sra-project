@java.lang.Override
protected void configure(final org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().disable().authorizeRequests().antMatchers("/userProfile").hasRole("USER").and().formLogin().loginPage("/").usernameParameter("username").passwordParameter("password").defaultSuccessUrl("/userProfile").loginProcessingUrl("/login").failureUrl("/login.html?error=true").and().logout().logoutSuccessUrl("/");
}