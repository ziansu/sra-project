public final void init(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    configure(http, stormpathAuthenticationSuccessHandler(), stormpathLogoutHandler());
    doConfigure(http);
}