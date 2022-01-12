public org.apache.http.HttpResponse isLogin() throws java.io.IOException, java.net.URISyntaxException {
    org.apache.http.client.utils.URIBuilder builder = new org.apache.http.client.utils.URIBuilder();
    builder.setScheme(com.arr.rsoi.service.PROTOCOL).setHost(host).setPort(RestConstants.customerPort).setPath("/login/isLogin");
    org.apache.http.client.methods.HttpGet getUser = new org.apache.http.client.methods.HttpGet(builder.build());
    org.apache.http.client.HttpClient client = org.apache.http.impl.client.HttpClientBuilder.create().build();
    return client.execute(getUser);
}