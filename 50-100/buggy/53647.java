@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().antMatchers("/", "/index", "/register").permitAll().anyRequest().authenticated().and().csrf().disable().formLogin().permitAll().and().logout().permitAll();
}