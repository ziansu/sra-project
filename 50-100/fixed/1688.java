public void getHomeTimeline(long since_id, long max_id, com.loopj.android.http.AsyncHttpResponseHandler handler) {
    java.lang.String apiURL = getApiUrl("statuses/home_timeline.json");
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("count", 25);
    if (since_id > 0) {
        params.put("since_id", java.lang.String.valueOf(since_id));
    }
    if (max_id > 0) {
        params.put("max_id", java.lang.String.valueOf(max_id));
    }
    getClient().get(apiURL, params, handler);
}