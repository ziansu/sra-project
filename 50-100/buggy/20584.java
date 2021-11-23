private javax.ws.rs.core.Cookie authenticate() {
    javax.ws.rs.core.Response response = client.target(((serverUri) + (com.checkmarx.jenkins.web.client.RestClient.REST_AUTHENTICATION_URI))).request().post(javax.ws.rs.client.Entity.entity(authenticationRequest, MediaType.APPLICATION_JSON));
    validateResponse(response);
    java.util.Map<java.lang.String, javax.ws.rs.core.NewCookie> cookiesMap = response.getCookies();
    java.util.Map.Entry cookieEntry = ((java.util.Map.Entry) (cookiesMap.entrySet().toArray()[0]));
    return ((javax.ws.rs.core.Cookie) (cookieEntry.getValue()));
}