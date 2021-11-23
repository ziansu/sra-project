public static void delete(java.lang.String url, com.chinamobile.iot.onenet.OneNetApiCallback callback) {
    com.chinamobile.iot.onenet.OneNetApi.assertInitialized();
    com.chinamobile.iot.onenet.OneNetApi.assertUIThread();
    com.chinamobile.iot.onenet.OneNetApi.assertUrlConfigured();
    com.chinamobile.iot.onenet.OneNetApi.sHttpExecutor.delete(url, new com.chinamobile.iot.onenet.OneNetApiCallbackAdapter(callback));
}