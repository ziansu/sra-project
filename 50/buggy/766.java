private void showSwipeRefreshLoading(final boolean loading) {
    mRefreshLayout.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRefreshLayout.setRefreshing(loading);
        }
    });
}