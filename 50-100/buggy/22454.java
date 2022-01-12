@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.jady.retrofitclient.HttpManager.init(this, UrlConfig.BASE_URL);
    com.jady.retrofitclient.HttpManager.getInstance().setOnGetHeadersListener(new com.jady.retrofitclient.HttpManager.OnGetHeadersListener() {
        @java.lang.Override
        public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            java.util.Map<java.lang.String, java.lang.String> headers = new java.util.HashMap<>();
            headers.put("access_token", "1234");
            return headers;
        }
    });
}