private org.apache.cxf.jaxrs.client.WebClient getWebClient(java.lang.String path) throws java.lang.Exception {
    org.apache.cxf.jaxrs.client.WebClient client = org.apache.cxf.jaxrs.client.WebClient.create(((io.subutai.core.hubadapter.impl.HttpClient.HUB_ADDRESS) + path));
    fixAsyncHttp(client);
    org.apache.cxf.transport.http.HTTPConduit httpConduit = ((org.apache.cxf.transport.http.HTTPConduit) (org.apache.cxf.jaxrs.client.WebClient.getConfig(client).getConduit()));
    httpConduit.setClient(getHTTPClientPolicy());
    httpConduit.setTlsClientParameters(getTLSClientParameters());
    return client;
}