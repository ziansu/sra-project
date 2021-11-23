public void start() {
    mProgress = 0.0F;
    mToolbar.startLoadProgress();
    mToolbar.setLoadProgress(mProgress);
    mHandler.sendEmptyMessage(org.chromium.chrome.browser.toolbar.ToolbarManager.LoadProgressSimulator.MSG_ID_UPDATE_PROGRESS);
}