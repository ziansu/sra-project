private com.ning.http.client.Request req(java.lang.String method, java.lang.String url) {
    com.ning.http.client.RequestBuilder builder = new com.ning.http.client.RequestBuilder(method);
    if ((realm) != null) {
        builder.setRealm(realm);
    }else {
        builder.addHeader("Authorization", ("Bearer " + (oauthToken)));
    }
    builder.setUrl(url.replace("%2B", "+"));
    return builder.build();
}