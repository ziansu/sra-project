@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("count", 25);
    params.put("max_id", com.walmartlabs.classwork.tweets.activities.TimelineActivity.maxId);
    fetchAndPopulateTimeline(params);
    return true;
}