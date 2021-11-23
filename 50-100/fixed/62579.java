@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/admins/**").hasAuthority(Role.ADMIN.toString()).anyRequest().permitAll().and().formLogin().loginPage("/login").permitAll().successForwardUrl("/hello").and().logout().permitAll();
}