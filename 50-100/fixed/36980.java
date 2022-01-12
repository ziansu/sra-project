private void updateRefreshingUI() {
    mSwipeRefreshLayout.setRefreshing(mIsRefreshing);
    android.support.design.widget.Snackbar snackbar;
    java.lang.String snackBarTextBegin = "Update ";
    java.lang.String snackBarTextEnd = (mIsRefreshing) ? "started" : "finished";
    snackbar = android.support.design.widget.Snackbar.make(coordinatorLayout, (snackBarTextBegin + snackBarTextEnd), Snackbar.LENGTH_LONG);
    snackbar.show();
}