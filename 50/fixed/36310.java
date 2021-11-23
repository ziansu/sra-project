@java.lang.Override
public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute route, org.apache.http.client.methods.HttpRequestWrapper request, org.apache.http.client.protocol.HttpClientContext clientContext, org.apache.http.client.methods.HttpExecutionAware execAware) throws java.io.IOException, org.apache.http.HttpException {
    return execChain.execute(route, request, clientContext, execAware);
}