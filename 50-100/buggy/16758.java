private com.ning.http.client.Request req(java.lang.String method, org.zendesk.client.v2.Uri template, int page) {
    com.ning.http.client.RequestBuilder builder = new com.ning.http.client.RequestBuilder(method);
    if ((realm) != null) {
        builder.setRealm(realm);
    }else {
        builder.addHeader("Authorization", ("Bearer " + (oauthToken)));
    }
    builder.addQueryParameter("page", java.lang.Integer.toString(page));
    builder.setUrl(template.toString().replace("%2B", "+"));
    return builder.build();
}