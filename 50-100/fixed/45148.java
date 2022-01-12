@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").anyRequest().permitAll().and().formLogin().defaultSuccessUrl("/index").loginProcessingUrl("/loginProcess").usernameParameter("name").passwordParameter("password").loginPage("/login").failureUrl("/login?error").and().logout().logoutSuccessUrl("/index").logoutUrl("/logout").permitAll();
}