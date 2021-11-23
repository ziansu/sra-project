private Invocation.Builder configureInvocationBuilder(java.lang.String url, com.mediamath.terminalone.models.T1User userMap, javax.ws.rs.client.Client client) {
    com.mediamath.terminalone.Connection.logger.info(com.mediamath.terminalone.Connection.TARGET_URL, url);
    javax.ws.rs.client.WebTarget webTarget = client.target(url);
    javax.ws.rs.client.Invocation.Builder invocationBuilder = webTarget.request();
    invocationBuilder.header(com.mediamath.terminalone.Connection.USER_AGENT, userAgent);
    invocationBuilder.header(com.mediamath.terminalone.Connection.ACCEPT, com.mediamath.terminalone.Connection.APPLICATION_VND_MEDIAMATH_V1_JSON);
    userSessionCheck(userMap, invocationBuilder);
    return invocationBuilder;
}