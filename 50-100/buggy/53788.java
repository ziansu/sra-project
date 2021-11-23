private org.apache.cxf.jaxrs.client.WebClient getWebClient(java.lang.String path) throws java.lang.Exception {
    org.apache.cxf.jaxrs.client.WebClient client = org.apache.cxf.jaxrs.client.WebClient.create(((io.subutai.core.hubadapter.impl.HttpClient.HUB_ADDRESS) + path));
    io.subutai.core.hubadapter.impl.HttpClient.fixAsyncHttp(client);
    org.apache.cxf.transport.http.HTTPConduit httpConduit = ((org.apache.cxf.transport.http.HTTPConduit) (org.apache.cxf.jaxrs.client.WebClient.getConfig(client).getConduit()));
    httpConduit.setClient(io.subutai.core.hubadapter.impl.HttpClient.getHTTPClientPolicy());
    httpConduit.setTlsClientParameters(io.subutai.core.hubadapter.impl.HttpClient.getTLSClientParameters());
    return client;
}