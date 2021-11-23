@java.lang.Override
public com.squareup.okhttp.Response intercept(org.dataconservancy.cos.osf.client.model.Chain chain) throws java.io.IOException {
    com.squareup.okhttp.Request req = chain.request();
    org.dataconservancy.cos.osf.client.model.AbstractMockServerTest.RecursiveInterceptor.LOG.debug("HTTP request: {}", req.urlString());
    java.nio.file.Path resourcePath = resolver.resolve(testName, baseUri, req.uri());
    org.dataconservancy.cos.osf.client.model.AbstractMockServerTest.RecursiveInterceptor.LOG.debug("Response resource: {}", resourcePath.toString());
    req = req.newBuilder().addHeader(org.dataconservancy.cos.osf.client.model.AbstractMockServerTest.X_RESPONSE_RESOURCE, resourcePath.toString()).build();
    return chain.proceed(req);
}