protected void onRefresh() {
    if (mIsRefreshing) {
        return ;
    }
    mIsRefreshing = true;
    mIRefreshView.doRefresh();
    if ((mListener) != null) {
        mListener.onRefresh();
    }
}