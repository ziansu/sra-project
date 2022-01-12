@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
protected void doStart() throws java.lang.Exception {
    super.doStart();
    com.sarwarbhuiyan.camel.component.elasticsearch.http.ElasticsearchHTTPEndpoint.LOG.info("Using HTTP Client ");
    esHttpClient = new com.sarwarbhuiyan.camel.component.elasticsearch.http.ElasticsearchHTTPClient();
    esHttpClient.setHost(configuration.getIp());
    esHttpClient.setPort(java.lang.String.valueOf(configuration.getPort()));
    return ;
}