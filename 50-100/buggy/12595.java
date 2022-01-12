public void closeBrowser() {
    mBrowserFrame.setBackgroundColor(mBackgroundColor);
    performExitCleanUp();
    mBrowserFrame.removeAllViews();
    int size = mTabsManager.size();
    mTabsManager.shutdown();
    mCurrentView = null;
    for (int n = 0; n < size; n++) {
        mTabsView.tabRemoved(n);
    }
    finish();
}