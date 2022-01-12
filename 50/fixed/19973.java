@java.lang.Override
public void configure(org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer resources) throws java.lang.Exception {
    resources.tokenStore(this.tokenStore());
}