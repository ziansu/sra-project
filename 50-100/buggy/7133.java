@java.lang.Override
protected void startRefresh() {
    if ((((mRefreshStatus) != (RefreshStatus.REFRESHING)) && ((mRefreshDelegate) != null)) && ((mHTViewHolder) != null)) {
        mRefreshStatus = RefreshStatus.REFRESHING;
        processRefreshStatusChanged();
        mRefreshDelegate.onRefresh();
        changeRefreshViewPositionWithAnimation(0, null);
    }
}