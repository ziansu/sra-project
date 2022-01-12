public void showPageLoadingStatus(final com.okandroid.boot.widget.PageDataAdapter.PageLoadingStatus pageLoadingStatus, final com.okandroid.boot.widget.PageDataAdapter.ExtraPageLoadingStatusCallback callback) {
    getRecyclerView().postOnAnimation(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.okandroid.boot.widget.PageDataAdapter.ExtraPageLoadingStatusCallback safetyCallback = callback;
            if (safetyCallback == null) {
                safetyCallback = new com.okandroid.boot.widget.PageDataAdapter.SimpleExtraPageLoadingStatusCallback();
                ensurePageLoadingStatusHandler();
                mPageLoadingStatusHandler.showPageLoadingStatus(com.okandroid.boot.widget.PageDataAdapter.this, pageLoadingStatus, safetyCallback);
            }
        }
    });
}