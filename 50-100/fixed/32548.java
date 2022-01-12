@com.orange.clara.cloud.servicedbdumper.config.Bean
@com.orange.clara.cloud.servicedbdumper.config.Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public org.springframework.security.oauth2.common.OAuth2AccessToken getOAuth2AccessToken() {
    if (!((org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication()) instanceof org.springframework.security.oauth2.provider.OAuth2Authentication)) {
        return null;
    }
    org.springframework.security.oauth2.provider.OAuth2Authentication oAuth2Authentication = ((org.springframework.security.oauth2.provider.OAuth2Authentication) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication()));
    final org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails details = ((org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails) (oAuth2Authentication.getDetails()));
    return new org.springframework.security.oauth2.common.DefaultOAuth2AccessToken(details.getTokenValue());
}