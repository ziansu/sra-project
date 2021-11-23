private static void post(java.lang.String url, java.io.File file, com.chinamobile.iot.onenet.OneNetApiCallback callback) {
    com.chinamobile.iot.onenet.OneNetApi.assertInitialized();
    com.chinamobile.iot.onenet.OneNetApi.assertUIThread();
    com.chinamobile.iot.onenet.OneNetApi.assertUrlConfigured();
    okhttp3.RequestBody requestBody = okhttp3.RequestBody.create(okhttp3.MediaType.parse("application/octet-stream"), file);
    com.chinamobile.iot.onenet.OneNetApi.sHttpExecutor.post(url, requestBody, new com.chinamobile.iot.onenet.OneNetApiCallbackAdapter(callback));
}