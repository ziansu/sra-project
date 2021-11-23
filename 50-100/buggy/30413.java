@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.logout().and().csrf().disable().headers().frameOptions().disable().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests().antMatchers("/api/**").authenticated().antMatchers("/management/**").hasAuthority(com.igitras.common.utils.Constants.Authority.ADMIN).antMatchers("/configuration/ui").permitAll();
}