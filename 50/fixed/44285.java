@java.lang.Override
public void onRefresh() {
    if ((comments) != null) {
        comments.loadMore(adapter, subreddit, true);
    }else {
        mSwipeRefreshLayout.setRefreshing(false);
    }
}