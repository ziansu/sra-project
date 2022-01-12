private com.loopj.android.http.AsyncHttpClient addHeaders(com.hiddensound.model.HiddenModel hiddenModel) {
    com.loopj.android.http.AsyncHttpClient client = new com.loopj.android.http.AsyncHttpClient();
    java.lang.String token = "Bearer " + (hiddenModel.getToken());
    if ((hiddenModel.getToken()) != null) {
        client.addHeader("Content-Type", "application/x-www-form-urlencoded");
        client.addHeader("Authorization", token);
    }else
        client.addHeader("Content-Type", "application/x-www-form-urlencoded");
    
    return client;
}