@java.lang.Override
public okhttp3.Response intercept(org.gdg.frisbee.android.api.Chain chain) throws java.io.IOException {
    org.gdg.frisbee.android.api.EspressoIdlingResource.increment();
    okhttp3.Request request = chain.request();
    return chain.proceed(request);
}