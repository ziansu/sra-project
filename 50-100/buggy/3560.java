public void getHomeTimeline(java.lang.Long maxId, java.lang.String paramName, com.loopj.android.http.AsyncHttpResponseHandler handler) {
    java.lang.String apiUrl = getApiUrl("statuses/home_timeline.json");
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("count", com.gevkurg.twitterclient.network.TwitterClient.TWEETS_PER_PAGE);
    params.put("include_entities", true);
    params.put(paramName, maxId);
    client.get(apiUrl, params, handler);
}