@java.lang.Override
protected com.google.common.util.concurrent.ListenableFuture<org.jclouds.http.HttpResponse> invoke(org.apache.http.client.methods.HttpUriRequest nativeRequest) throws java.io.IOException {
    org.jclouds.http.HttpResponse apacheResponse = executeRequest(nativeRequest);
    return com.google.common.util.concurrent.Futures.immediateFuture(prepareResponse(nativeRequest, apacheResponse));
}