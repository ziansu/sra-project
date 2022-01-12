@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.sessionManagement().and().csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and().authorizeRequests().antMatchers("/public/**").permitAll().antMatchers("/private/**").hasRole("USER");
}