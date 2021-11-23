protected java.lang.String makeRequest(java.lang.String endpoint, java.lang.String queryString) throws java.lang.Exception {
    java.net.URI uri = org.apache.http.client.utils.URIUtils.createURI(uk.ac.jorum.integration.RestApiBaseTest.apiProtocol, uk.ac.jorum.integration.RestApiBaseTest.apiHost, uk.ac.jorum.integration.RestApiBaseTest.apiPort, ((uk.ac.jorum.integration.RestApiBaseTest.apiMountPoint) + endpoint), queryString, null);
    org.apache.http.client.methods.HttpGet httpget = new org.apache.http.client.methods.HttpGet(uri);
    httpget.addHeader("Accept", "application/json");
    org.apache.http.client.ResponseHandler<java.lang.String> responseHandler = new org.apache.http.impl.client.BasicResponseHandler();
    return client.execute(httpget, responseHandler);
}