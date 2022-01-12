protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity security) throws java.lang.Exception {
    security.authorizeRequests().anyRequest().authenticated().antMatchers("/css/**").permitAll().and().formLogin().loginPage("/login").permitAll().failureUrl("/login?error").permitAll().and().logout().permitAll();
}