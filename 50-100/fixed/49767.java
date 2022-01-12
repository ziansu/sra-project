@dagger.Provides
@javax.inject.Singleton
public okhttp3.OkHttpClient provideOkHttpClient() {
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor = new okhttp3.logging.HttpLoggingInterceptor();
    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder().connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS).readTimeout(30, java.util.concurrent.TimeUnit.SECONDS).addInterceptor(httpLoggingInterceptor);
    return builder.build();
}