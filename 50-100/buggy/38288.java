private void callGetWebService() {
    try {
        com.loopj.android.http.AsyncHttpClient client = new com.loopj.android.http.AsyncHttpClient();
        client.addHeader("Cache-Control", "no-cache");
        showLoadingDialog();
        callHotTopicApi(client);
        callRoomApi(client);
    } catch (java.lang.Exception e) {
        android.util.Log.e(LOG_TAG, ("RuntimeException : " + (e.getMessage())), e);
        closeLoadingDialog();
        showErrorDialog().show();
    }
}