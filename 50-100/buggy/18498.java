public void setRefreshing(boolean refreshing) {
    if ((!(isRefreshing)) && refreshing) {
        this.state = com.charry.krefresh.KRefreshLayout.REFRESHING;
        isRefreshing = true;
        if ((mRefreshHeadView) != null) {
            mRefreshHeadView.pullAction(0);
            createAnimTransYForHead(mContentView, mHeadHeight, mRefreshHeadView);
            mRefreshHeadView.refreshAction();
        }
    }else {
        finishRefreshing();
    }
}