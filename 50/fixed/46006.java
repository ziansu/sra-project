public static void setAccessToken(javax.servlet.http.HttpServletRequest request, org.springframework.security.oauth2.common.OAuth2AccessToken accessToken) {
    imcode.services.utils.IvisOAuth2Utils.setAccessToken(request.getSession(true), accessToken);
}