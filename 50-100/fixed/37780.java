@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/client/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')").antMatchers("/manager/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')").antMatchers("/dummy").access("hasRole('ROLE_ADMIN')").and().formLogin().loginPage("/login").loginProcessingUrl("/static/j_spring_security_check").and().csrf().disable();
}