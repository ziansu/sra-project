protected java.lang.String[] getAuthenticationCredentials() {
    com.netflix.zuul.context.RequestContext ctx = com.netflix.zuul.context.RequestContext.getCurrentContext();
    javax.servlet.http.HttpServletRequest request = ctx.getRequest();
    java.lang.String base64Credentials = request.getHeader(HttpHeaders.AUTHORIZATION).substring(net.smartcosmos.cluster.gateway.filters.PreAuthorizationFilter.BASIC_AUTHENTICATION_TYPE.length()).trim();
    java.lang.String decodedCredentials = new java.lang.String(java.util.Base64.getDecoder().decode(base64Credentials), java.nio.charset.StandardCharsets.UTF_8);
    return decodedCredentials.split(":", 2);
}