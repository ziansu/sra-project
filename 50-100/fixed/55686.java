public static okhttp3.OkHttpClient fileOkHttpClient() {
    okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
    builder.connectTimeout(5, java.util.concurrent.TimeUnit.MINUTES);
    builder.readTimeout(5, java.util.concurrent.TimeUnit.MINUTES);
    builder.writeTimeout(5, java.util.concurrent.TimeUnit.MINUTES);
    okhttp3.logging.HttpLoggingInterceptor interceptor = new okhttp3.logging.HttpLoggingInterceptor();
    com.futsal.manager.NetworkModule.ReceivedCookiesInterceptor receivedCookiesInterceptor = new com.futsal.manager.NetworkModule.ReceivedCookiesInterceptor(com.futsal.manager.NetworkModule.CommunicationWithServer.applicationContext);
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    builder.addInterceptor(receivedCookiesInterceptor);
    return builder.build();
}