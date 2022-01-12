@org.junit.Before
public void setup() throws java.io.IOException {
    server.start();
    com.acuo.common.http.client.OkHttpClient httpClient = new com.acuo.common.http.client.OkHttpClient.Builder().addInterceptor(new com.acuo.common.http.client.LoggingInterceptor()).build();
    com.acuo.valuation.providers.reuters.services.ReutersEndPointConfig config = new com.acuo.valuation.providers.reuters.services.ReutersEndPointConfig("http", server.getHostName(), server.getPort(), "testUpload", "key", "secret", "10000", 10000, "false");
    com.acuo.common.http.client.ClientEndPoint<com.acuo.valuation.providers.reuters.services.ReutersEndPointConfig> clientEndPoint = new com.acuo.common.http.client.OkHttpClient(httpClient, config);
    reutersService = new com.acuo.valuation.providers.reuters.services.ReutersServiceImpl(clientEndPoint, transformer, valuationTransformer);
}