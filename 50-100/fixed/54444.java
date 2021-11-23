@java.lang.Override
public com.squareup.okhttp.Response intercept(com.jaspersoft.android.sdk.widget.base.client.Chain chain) throws java.io.IOException {
    com.squareup.okhttp.Response response = chain.proceed(chain.request());
    java.lang.String cacheHeaderValue = "max-age=" + (com.jaspersoft.android.sdk.widget.base.client.CacheInterceptor.CACHE_LIFE_TIME);
    return response.newBuilder().header("Cache-Control", cacheHeaderValue).build();
}