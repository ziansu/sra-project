public void getFollowingList(java.lang.String cursor, java.lang.String screenName, com.loopj.android.http.AsyncHttpResponseHandler handler) {
    java.lang.String apiUrl = getApiUrl("followers/list.json");
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("cursor", cursor);
    params.put("screen_name", screenName);
    getClient().get(apiUrl, params, handler);
}