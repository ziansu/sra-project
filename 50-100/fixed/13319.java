@java.lang.Override
public java.lang.String getClientIdFromAPIRequest() {
    org.springframework.security.core.context.SecurityContext context = org.springframework.security.core.context.SecurityContextHolder.getContext();
    org.springframework.security.core.Authentication authentication = context.getAuthentication();
    if ((authentication != null) && (org.springframework.security.oauth2.provider.OAuth2Authentication.class.isAssignableFrom(authentication.getClass()))) {
        org.springframework.security.oauth2.provider.OAuth2Authentication oAuth2Authentication = ((org.springframework.security.oauth2.provider.OAuth2Authentication) (authentication));
        org.springframework.security.oauth2.provider.OAuth2Request request = oAuth2Authentication.getOAuth2Request();
        return request.getClientId();
    }
    return null;
}