@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.authorizeRequests().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll().and().httpBasic().and().rememberMe().rememberMeServices(rememberMeServices).key(CustomRememberMeServices.REMEMBER_ME_TOKEN_KEY).and().anonymous().disable();
}