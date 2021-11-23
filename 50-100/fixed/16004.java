protected void generateDigestChallenge(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, com.liferay.portal.kernel.security.auth.http.HttpAuthorizationHeader httpAuthorizationHeader) {
    long companyId = com.liferay.portal.util.PortalInstances.getCompanyId(httpServletRequest);
    java.lang.String remoteAddress = httpServletRequest.getRemoteAddr();
    java.lang.String nonce = com.liferay.portal.servlet.filters.secure.NonceUtil.generate(companyId, remoteAddress);
    httpAuthorizationHeader.setAuthParameter(HttpAuthorizationHeader.AUTH_PARAMETER_NAME_NONCE, nonce);
    httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, httpAuthorizationHeader.toString());
    httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
}