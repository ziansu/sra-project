protected synchronized void newTab(java.lang.String url, boolean show) {
    mIsNewIntent = false;
    acr.browser.lightning.LightningView startingTab = new acr.browser.lightning.LightningView(mActivity, url);
    if ((mIdGenerator) == 0) {
        startingTab.resumeTimers();
    }
    (mIdGenerator)++;
    mWebViews.add(startingTab);
    mTitleAdapter.notifyDataSetChanged();
    if (show) {
        mDrawerListLeft.setItemChecked(((mWebViews.size()) - 1), true);
        showTab(startingTab);
    }
}