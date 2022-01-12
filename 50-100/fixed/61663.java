public void onMapBtnClicked(android.view.View v) {
    if (isState(com.v2tech.presenter.MainPresenter.VIDEO_SHARE_BTN_SHOW)) {
        ui.showVideoshareBtnLayout(false);
        unsetState(com.v2tech.presenter.MainPresenter.VIDEO_SHARE_BTN_SHOW);
        ui.showP2PLiverLayout(true);
        if ((currentLive) != null) {
            ls.getWatcherList(currentLive, new com.v2tech.service.MessageListener(h, com.v2tech.presenter.MainPresenter.WATCHER_LIST, currentLive));
        }
    }
}