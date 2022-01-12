@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/", "/home", "/home/**").permitAll().antMatchers("/admins/**").hasAuthority(Role.ADMIN.toString()).anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().successForwardUrl("/hello").and().logout().permitAll();
}