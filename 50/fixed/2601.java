@java.lang.Override
protected org.jclouds.http.HttpResponse invoke(org.apache.http.client.methods.HttpUriRequest nativeRequest) throws java.io.IOException {
    org.jclouds.http.HttpResponse apacheResponse = executeRequest(nativeRequest);
    return prepareResponse(nativeRequest, apacheResponse);
}