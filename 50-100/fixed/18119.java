public void getFollowingList(java.lang.Long cursor, java.lang.String screenName, com.loopj.android.http.AsyncHttpResponseHandler handler) {
    java.lang.String apiUrl = getApiUrl("followers/list.json");
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    if (cursor > 0)
        params.put("cursor", cursor);
    
    params.put("screen_name", screenName);
    getClient().get(apiUrl, params, handler);
}