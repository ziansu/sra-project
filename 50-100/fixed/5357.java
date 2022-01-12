@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.antMatcher("/**").authorizeRequests().antMatchers("/index.html", "/login", "/", "/api/catalog/**", "/user", "/assets/**").permitAll().anyRequest().authenticated().and().csrf().disable();
}