@java.lang.Override
public void onRefresh() {
    swipeRefreshLayout.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            swipeRefreshLayout.setRefreshing(false);
            result = null;
            loadingMore = true;
            getData();
        }
    }, 3000);
}