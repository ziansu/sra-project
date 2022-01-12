public static void put(java.lang.String url, java.lang.String requestBodyString, com.chinamobile.iot.onenet.OneNetApiCallback callback) {
    com.chinamobile.iot.onenet.OneNetApi.assertInitialized();
    com.chinamobile.iot.onenet.OneNetApi.assertUIThread();
    com.chinamobile.iot.onenet.OneNetApi.assertUrlConfigured();
    okhttp3.RequestBody requestBody = okhttp3.RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), requestBodyString);
    com.chinamobile.iot.onenet.OneNetApi.sHttpExecutor.put(url, requestBody, new com.chinamobile.iot.onenet.OneNetApiCallbackAdapter(callback));
}