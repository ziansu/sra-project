private com.loopj.android.http.AsyncHttpClient addHeaders(com.hiddensound.model.HiddenModel hiddenModel) {
    com.loopj.android.http.AsyncHttpClient client = new com.loopj.android.http.AsyncHttpClient();
    if ((hiddenModel.getToken()) != null) {
        client.addHeader("Content-Type", "application/x-www-form-urlencoded");
        client.addHeader("Authorization", ("Bearer " + (hiddenModel.getToken())));
    }else
        client.addHeader("Content-Type", "application/x-www-form-urlencoded");
    
    return client;
}