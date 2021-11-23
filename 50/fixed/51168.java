protected void onRefresh() {
    mIRefreshView.doRefresh();
    if (mIsRefreshing) {
        return ;
    }
    mIsRefreshing = true;
    if ((mListener) != null) {
        mListener.onRefresh();
    }
}