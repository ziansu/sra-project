public void refresh() {
    if (mRefreshing) {
        return ;
    }
    if ((mPullRefreshEnabled) && ((mRefreshListener) != null)) {
        mRefreshHeader.onRefreshing();
        int offSet = mRefreshHeader.getHeaderView().getMeasuredHeight();
        mRefreshHeader.onMove(offSet, offSet);
        mRefreshing = true;
        mFootView.setVisibility(com.github.jdsjlzx.recyclerview.GONE);
        mRefreshListener.onRefresh();
    }
}