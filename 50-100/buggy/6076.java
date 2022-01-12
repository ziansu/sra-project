public okhttp3.OkHttpClient getOkHttpClient() {
    if ((okHttpClient) == null) {
        okhttp3.OkHttpClient.Builder okHttpClientBuilder = new okhttp3.OkHttpClient.Builder().addNetworkInterceptor(new com.tvdbRestClient.utils.TvdbInterceptor()).authenticator(new com.tvdbRestClient.utils.TvdbAuthenticator(this));
        okHttpClient = okHttpClientBuilder.build();
    }
    return okHttpClient;
}