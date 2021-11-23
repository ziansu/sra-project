@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    swipeRefreshLayout.setRefreshing(false);
    swipeRefreshLayout.setEnabled(false);
}