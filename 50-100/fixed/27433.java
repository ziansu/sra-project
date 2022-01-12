@java.lang.Override
public void showTimeline(java.util.List<com.zac4j.yoda.data.model.Weibo> weiboList) {
    if ((mRequestPage) == 1) {
        if ((mScrollListener) != null) {
            mScrollListener.resetState();
        }
        mTimelineAdapter.clear();
        mWeiboListView.setVisibility(android.view.View.VISIBLE);
    }
    mTimelineAdapter.addWeiboList(weiboList);
    mSwipeContainer.setRefreshing(false);
}