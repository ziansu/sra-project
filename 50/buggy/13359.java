public void pause() {
    browserPresenter.detachTabView();
    pauseWebView(getWebViewForTabId(currentId));
}