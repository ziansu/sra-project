@java.lang.Override
public void putAccessTokenO(javax.servlet.http.HttpServletResponse response, java.lang.String accessTokenO) {
    java.lang.String accessToken = countAccessToken(accessTokenO);
    java.lang.String accessTokenP = countAccessTokenP(accessToken);
    putCookie(response, robertli.zero.core.impl.ClientAccessTokenManagerImpl.COOKIE_ACCESS_TOKEN_O, accessTokenO);
    putCookie(response, robertli.zero.core.impl.ClientAccessTokenManagerImpl.COOKIE_ACCESS_TOKEN_P, accessTokenP);
}