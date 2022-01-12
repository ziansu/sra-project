public java.lang.String isLogin() throws java.io.IOException, java.net.URISyntaxException {
    org.apache.http.client.utils.URIBuilder builder = new org.apache.http.client.utils.URIBuilder();
    builder.setScheme(com.arr.rsoi.service.PROTOCOL).setHost(host).setPort(RestConstants.customerPort).setPath("/login/isLogin");
    org.apache.http.client.methods.HttpGet getUser = new org.apache.http.client.methods.HttpGet(builder.build());
    org.apache.http.client.HttpClient client = org.apache.http.impl.client.HttpClientBuilder.create().build();
    final org.apache.http.HttpResponse pizzasResponse = client.execute(getUser);
    return com.arr.rsoi.service.RestHelper.getContent(pizzasResponse);
}