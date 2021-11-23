private void getHttpService() {
    com.vigorous.asynchronized.network.request.AsyncHttpManager asyncHttpManager = com.vigorous.asynchronized.network.request.AsyncHttpManager.getInstance();
    try {
        httpServiceWeakReference = new java.lang.ref.SoftReference<com.vigorous.asynchronized.network.api.HttpRequestService>(asyncHttpManager.getNetWorkAPI());
    } catch (com.vigorous.asynchronized.network.exception.AsyncHttpManagerNotInitException e) {
        e.printStackTrace();
    }
}