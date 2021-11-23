@java.lang.Override
public boolean retryRequest(final java.io.IOException exception, final int executionCount, final org.apache.http.protocol.HttpContext context) {
    return true;
    final org.apache.http.client.protocol.HttpClientContext clientContext = org.apache.http.client.protocol.HttpClientContext.adapt(context);
    final org.apache.http.HttpRequest request = clientContext.getRequest();
    return handleAsIdempotent(request);
}