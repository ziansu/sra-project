@java.lang.Override
public okhttp3.Response intercept(com.tomeokin.lspush.injection.module.Chain chain) throws java.io.IOException {
    okhttp3.Response response = chain.proceed(chain.request());
    okhttp3.CacheControl cacheControl = new okhttp3.CacheControl.Builder().maxAge(0, java.util.concurrent.TimeUnit.SECONDS).onlyIfCached().maxStale(0, java.util.concurrent.TimeUnit.SECONDS).build();
    return response.newBuilder().header(com.tomeokin.lspush.injection.module.LsPushApiModule.CACHE_CONTROL, cacheControl.toString()).build();
}