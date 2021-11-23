public static boolean isTokenAuthorized(javax.ws.rs.container.ContainerRequestContext requestContext, javax.servlet.http.HttpServletRequest httpRequest, gov.usgs.cida.auth.client.IAuthClient client, java.util.List<java.lang.String> additionalRoles) {
    boolean authenticated = false;
    authenticated = gov.usgs.cida.auth.utils.HttpTokenUtils.isTokenAuthorized(httpRequest, client, additionalRoles);
    java.lang.String tokenId = gov.usgs.cida.auth.utils.HttpTokenUtils.getTokenFromHeader(httpRequest.getHeader(HttpTokenUtils.AUTHORIZATION_HEADER));
    if (authenticated) {
        gov.usgs.cida.auth.ws.rs.service.SecurityContextUtils.populateSecurityContext(requestContext, httpRequest, client, tokenId, additionalRoles);
        gov.usgs.cida.auth.utils.HttpTokenUtils.saveTokenToSession(httpRequest, tokenId);
    }
    return authenticated;
}