@java.lang.Override
public void hideLoadingIndicator() {
    mLoadingView.hideLoadingIndicator();
    mSwipeRefreshLayout.setRefreshing(false);
}