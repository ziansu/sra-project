private org.apache.http.HttpResponse executeWithAuthentication(org.apache.http.client.methods.HttpUriRequest request) throws java.io.IOException, org.apache.http.client.ClientProtocolException {
    org.apache.http.client.protocol.HttpClientContext context = createHttpContext();
    return org.opentravel.schemacompiler.repository.impl.RemoteRepositoryClient.createHttpClient().execute(request, context);
}