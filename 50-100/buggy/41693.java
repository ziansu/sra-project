public void getMentionsTimeline(long lastId, com.loopj.android.http.AsyncHttpResponseHandler handler) {
    java.lang.String apiUrl = getApiUrl("statuses/mentions_timeline.json");
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("count", 25);
    if (lastId == 1) {
        params.put("since_id", lastId);
    }else {
        params.put("max_id", lastId);
    }
    client.get(apiUrl, params, handler);
}