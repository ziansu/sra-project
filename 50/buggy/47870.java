private void setupPullToRefresh() {
    swipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
        @java.lang.Override
        public void onRefresh() {
            mainChannelPresenter.getLastVideosFromYoutubeChannel(true);
        }
    });
}