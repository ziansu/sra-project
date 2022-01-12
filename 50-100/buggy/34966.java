private void initPullToRefresh() {
    java.lang.System.out.println("LoadingHelper.initPullToRefresh");
    if (mAdapter.isShowTopError()) {
        mAdapter.showTopError(false);
    }
    if (!(mAdapter.isShowTopLoading())) {
        mAdapter.showTopLoading(true);
    }
    if ((mTopLoadingView) != null) {
        mTopLoadingView.getLayoutParams().height = 1;
        mTopLoadingProgressBar.setIndeterminate(false);
        mTopLoadingView.requestLayout();
    }
    mRecyclerView.scrollBy((-1), 0);
}