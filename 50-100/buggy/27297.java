public static org.apache.http.HttpResponse getDiscs(java.lang.String token) throws java.io.IOException {
    org.apache.http.client.HttpClient client2 = org.apache.http.impl.client.HttpClientBuilder.create().build();
    org.apache.http.client.methods.HttpGet request = TestUtils.getHttpGet(token, "/discs", 8084);
    org.apache.http.HttpResponse response2 = client2.execute(request);
    java.lang.System.out.println("Ergebnis:");
    java.lang.System.out.println(org.apache.http.util.EntityUtils.toString(response2.getEntity()));
    return response2;
}