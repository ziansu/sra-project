@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.formLogin().loginPage("/login").defaultSuccessUrl("/me").permitAll().and().authorizeRequests().antMatchers("/", "/logout").permitAll().and().logout().logoutSuccessUrl("/login?logout").and().authorizeRequests().antMatchers("/merchant/add").authenticated();
}