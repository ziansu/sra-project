@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().disable();
    http.authorizeRequests().antMatchers("/resources/**").permitAll().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
}