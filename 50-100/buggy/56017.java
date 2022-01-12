@java.lang.Override
public okhttp3.Response intercept(cn.droidlover.xdroidmvp.net.Chain chain) throws java.io.IOException {
    okhttp3.Request request = chain.request();
    if ((handler) != null) {
        request = handler.onBeforeRequest(request, chain);
    }
    okhttp3.Response response = chain.proceed(request);
    if ((handler) != null) {
        response = handler.onAfterRequest(response, response.body().string(), chain);
    }
    return response;
}