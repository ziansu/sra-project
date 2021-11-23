@java.lang.Override
public org.springframework.security.oauth2.provider.OAuth2Authentication loadAuthentication(java.lang.String accessToken) throws org.springframework.security.core.AuthenticationException, org.springframework.security.oauth2.common.exceptions.InvalidTokenException {
    java.util.Map<java.lang.String, java.lang.Object> userInfoMap = getPaycoIdUserInfo();
    if ((userInfoMap == null) || (userInfoMap.isEmpty())) {
        throw new org.springframework.security.oauth2.common.exceptions.InvalidTokenException(accessToken);
    }
    return extractAuthentication(userInfoMap);
}