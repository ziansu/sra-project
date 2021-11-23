@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.antMatcher("/**").authorizeRequests().antMatchers("/index.html", "/home.html", "/login", "/", "/api/catalog/**", "/user", "/assets/**", "/css/**", "/dist/**", "/js/**").permitAll().anyRequest().authenticated().and().csrf().disable();
}