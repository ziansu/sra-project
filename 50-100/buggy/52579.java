@javax.inject.Singleton
@dagger.Provides
public okhttp3.OkHttpClient provideOkhttpClient(com.google.gson.Gson gson) {
    okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
    if (com.lxy.shop.BuildConfig.DEBUG) {
        okhttp3.logging.HttpLoggingInterceptor logging = new okhttp3.logging.HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(logging);
    }
    return builder.addInterceptor(new com.lxy.shop.common.http.ParamsInterceptor(com.lxy.shop.common.base.BaseApplication.getInstance(), gson)).connectTimeout(10, java.util.concurrent.TimeUnit.SECONDS).readTimeout(10, java.util.concurrent.TimeUnit.SECONDS).build();
}