@java.lang.Override
public okhttp3.Response intercept(io.opentracing.contrib.okhttp3.Chain chain) throws java.io.IOException {
    io.opentracing.Scope activeInterceptorSpan = tracer.scopeManager().activate(finalScope.span(), true);
    try {
        return chain.proceed(chain.request());
    } catch (java.lang.Exception ex) {
        for (io.opentracing.contrib.okhttp3.OkHttpClientSpanDecorator spanDecorator : decorators) {
            spanDecorator.onError(ex, activeInterceptorSpan.span());
        }
        throw ex;
    } finally {
        activeInterceptorSpan.close();
    }
}