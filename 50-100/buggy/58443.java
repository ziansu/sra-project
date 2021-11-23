@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/register", "/login", "/css/**", "/js/**", "/vander/**").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").loginProcessingUrl("/login").defaultSuccessUrl("/lobby", true).permitAll().and().logout().logoutUrl("/logout").invalidateHttpSession(true);
}