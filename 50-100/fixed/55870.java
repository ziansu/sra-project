public void logout() throws com.github.cypher.sdk.api.RestfulHTTPException, java.io.IOException {
    if ((session) == null) {
        return ;
    }
    java.util.Map<java.lang.String, java.lang.String> parameters = new java.util.HashMap<>();
    parameters.put("access_token", session.getAccessToken());
    java.net.URL url = com.github.cypher.sdk.api.Util.UrlBuilder(session.getHomeServer(), Endpoint.LOGOUT, null, parameters);
    com.google.gson.JsonObject response = com.github.cypher.sdk.api.Util.makeJsonPostRequest(url, null).getAsJsonObject();
    this.session = null;
}