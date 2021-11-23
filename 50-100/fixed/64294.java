private static void initHttpClient() {
    okhttp3.OkHttpClient.Builder httpClientBuilder = new okhttp3.OkHttpClient.Builder();
    if ((httpClientBuilder.interceptors()) != null) {
        httpClientBuilder.interceptors().clear();
    }
    httpClientBuilder.addNetworkInterceptor(new com.dorothy.v2ex.http.RecivedCookieIntercepter(com.dorothy.v2ex.http.V2EXHttpClient.context)).addNetworkInterceptor(new com.dorothy.v2ex.http.AddCookieIntercepter(com.dorothy.v2ex.http.V2EXHttpClient.context));
    httpClientBuilder.connectTimeout(10, java.util.concurrent.TimeUnit.SECONDS).readTimeout(10, java.util.concurrent.TimeUnit.SECONDS);
    com.dorothy.v2ex.http.V2EXHttpClient.mOkhttpClient = httpClientBuilder.build();
}