@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().disable().headers().frameOptions().disable().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests().antMatchers("/api/profile-info").permitAll().antMatchers("/api/**").authenticated().antMatchers("/proxy/**").authenticated().antMatchers("/management/**").hasAuthority(AuthorityConstants.PODIUM_ADMIN).antMatchers("/swagger-resources/configuration/ui").permitAll();
}