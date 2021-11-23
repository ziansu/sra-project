public static org.springframework.security.oauth2.client.OAuth2ClientContext getClientContext(javax.servlet.http.HttpServletRequest request) {
    return imcode.services.utils.IvisOAuth2Utils.getClientContext(request.getSession());
}