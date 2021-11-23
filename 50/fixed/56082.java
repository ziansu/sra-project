@java.lang.Override
public void configure(org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer resources) {
    resources.resourceId("RESOURCE_ID").stateless(true);
    resources.authenticationEntryPoint(new com.ckr.authsrv.security.CustomizedAuthenticationEntryPoint());
}