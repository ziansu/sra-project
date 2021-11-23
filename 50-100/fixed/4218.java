protected void setRefreshingInternal(boolean doScroll) {
    state = com.handmark.pulltorefresh.library.PullToRefreshBase.REFRESHING;
    if (null != (headerLayout)) {
        headerLayout.refreshing();
    }
    if (null != (footerLayout)) {
        footerLayout.refreshing();
    }
    if (doScroll) {
        smoothScrollTo(((mode) == (com.handmark.pulltorefresh.library.PullToRefreshBase.MODE_PULL_DOWN_TO_REFRESH) ? -(headerHeight) : headerHeight));
    }
}