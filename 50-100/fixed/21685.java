@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().csrfTokenRepository(org.springframework.security.web.csrf.CookieCsrfTokenRepository.withHttpOnlyFalse()).and().httpBasic().and().authorizeRequests().antMatchers("/index.html", "/home.html", "/login.html", "/").permitAll().anyRequest().authenticated();
}