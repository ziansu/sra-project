@java.lang.Override
public okhttp3.Response intercept(okhttp3.internal.ws.Chain chain) throws java.io.IOException {
    org.junit.Assert.assertNull(chain.request().body());
    okhttp3.Response response = chain.proceed(chain.request());
    org.junit.Assert.assertEquals("Upgrade", response.header("Connection"));
    org.junit.Assert.assertTrue("", response.body().source().exhausted());
    interceptedCount.incrementAndGet();
    return response;
}