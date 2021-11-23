private void swipeRefresh() {
    com.jakewharton.rxbinding.support.v4.widget.RxSwipeRefreshLayout.refreshes(mRefreshLayout).compose(this.<java.lang.Void>bindToLifecycle()).subscribe(new rx.functions.Action1<java.lang.Void>() {
        @java.lang.Override
        public void call(java.lang.Void aVoid) {
            mPage = 1;
            refreshing = true;
            fetchGirlData(true);
        }
    });
}