@java.lang.Override
public void onRefresh() {
    mPageCount = 1;
    mPostAdapter.clear();
    mRefreshLayout.setRefreshing(true);
}