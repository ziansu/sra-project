@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.formLogin().loginPage("/login").and().logout().and().httpBasic().and().rememberMe().rememberMeServices(rememberMeServices).key(CustomRememberMeServices.REMEMBER_ME_TOKEN_KEY).and().anonymous().disable();
}