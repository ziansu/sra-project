private void updateRefreshingUI() {
    mSwipeRefreshLayout.setRefreshing(mIsRefreshing);
    android.support.design.widget.Snackbar snackbar;
    java.lang.String snackBarTextBegin = "Update ";
    java.lang.String snackBarTextEnd = (com.example.xyzreader.ui.ArticleListActivity.updateStart) ? "started" : "finished";
    snackbar = android.support.design.widget.Snackbar.make(coordinatorLayout, (snackBarTextBegin + snackBarTextEnd), Snackbar.LENGTH_LONG);
    snackbar.show();
    com.example.xyzreader.ui.ArticleListActivity.updateStart = !(com.example.xyzreader.ui.ArticleListActivity.updateStart);
}