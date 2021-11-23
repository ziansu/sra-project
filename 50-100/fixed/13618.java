public void register(java.lang.String name, java.lang.String email, java.lang.String password, com.loopj.android.http.JsonHttpResponseHandler handler) {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    params.put("password", password);
    params.put("name", name);
    params.put("email", email);
    com.loopj.android.http.RequestParams requestParams = new com.loopj.android.http.RequestParams(params);
    java.lang.String url = getApiUrl("/register");
    client.post(url, requestParams, handler);
}