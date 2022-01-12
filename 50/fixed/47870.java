private void setupPullToRefresh() {
    swipeRefreshLayout.setOnRefreshListener(() -> {
        mainChannelPresenter.getLastVideosFromYoutubeChannel(true);
    });
}