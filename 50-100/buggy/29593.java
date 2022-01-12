@java.lang.Override
public void setup(com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginSetupContext context) {
    final com.navercorp.pinpoint.plugin.httpclient4.HttpClient4PluginConfig config = new com.navercorp.pinpoint.plugin.httpclient4.HttpClient4PluginConfig(context.getConfig());
    addHttpRequestExecutorClass();
    addDefaultHttpRequestRetryHandlerClass();
    logger.debug("Add HttpClient4(4.0 ~ 4.2");
    addAbstractHttpClient4Class();
    addAbstractPooledConnAdapterClass();
    addManagedClientConnectionImplClass();
    logger.debug("Add CloseableHttpClient4(4.3 ~ ");
    addCloseableHttpClientClass();
    addBasicHttpClientConnectionManagerClass();
    addPoolingHttpClientConnectionManagerClass();
    logger.debug("Add CloseableHttpAsyncClient4(4.0 ~ ");
    addClosableHttpAsyncClientClass();
    addDefaultClientExchangeHandlerImplClass();
    addBasicFutureClass();
}