protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    authorizeApi(http);
    authorizeWeb(http);
}