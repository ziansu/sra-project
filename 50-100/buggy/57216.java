protected int getResponseCode(java.lang.String endpoint, java.lang.String queryString) throws java.lang.Exception {
    java.net.URI uri = org.apache.http.client.utils.URIUtils.createURI(uk.ac.jorum.integration.RestApiBaseTest.apiProtocol, uk.ac.jorum.integration.RestApiBaseTest.apiHost, uk.ac.jorum.integration.RestApiBaseTest.apiPort, ((uk.ac.jorum.integration.RestApiBaseTest.apiMountPoint) + endpoint), queryString, "");
    org.apache.http.client.methods.HttpGet httpget = new org.apache.http.client.methods.HttpGet(uri);
    httpget.addHeader("Accept", "application/json");
    org.apache.http.HttpResponse response = client.execute(httpget);
    return response.getStatusLine().getStatusCode();
}