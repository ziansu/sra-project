protected void executeUserLogout(org.apache.http.impl.client.CloseableHttpClient httpClient, org.apache.http.protocol.HttpContext httpContext) {
    java.lang.String urlRequest = createApacheCloudStackApiUrlRequest(new br.com.autonomiccs.apacheCloudStack.client.ApacheCloudStackRequest("logout").addParameter("response", "json"), false);
    java.lang.String returnOfLogout = executeRequestGetResponseAsString(urlRequest, httpClient, httpContext);
    logger.debug(java.lang.String.format("Logout result[%s]", returnOfLogout));
}