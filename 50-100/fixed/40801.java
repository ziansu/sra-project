public void postUsers(android.view.View view) {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    params.put("PlayerName", "asewq");
    params.put("Score", "5");
    java.lang.String url = (com.zhy.sample_okhttp.MainActivity.Base_Url) + "/v1/object/";
    OkHttpRequest.Builder.build().tag(this).url(url).params(params).post(stringResultCallback);
}