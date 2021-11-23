protected void generateBasicChallenge(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, com.liferay.portal.kernel.security.auth.http.HttpAuthorizationHeader httpAuthorizationHeader) {
    httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, httpAuthorizationHeader.toChallengeString());
    httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
}