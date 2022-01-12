@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/", "/css/**", "/fonts/**", "/js/**", "/register", "/welcome", "/webjars/**", "/profile").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
}