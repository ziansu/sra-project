com.android.browser.Tab createNewTab(android.os.Bundle state, boolean privateBrowsing, boolean backgroundTab) {
    int size = mTabs.size();
    if (!(canCreateNewTab())) {
        return null;
    }
    final org.codeaurora.swe.WebView w = createNewWebView(privateBrowsing, backgroundTab);
    com.android.browser.Tab t = new com.android.browser.Tab(mController, w, state);
    mTabs.add(t);
    mTabCountObservable.set(mTabs.size());
    if (privateBrowsing) {
        mNumIncognito += 1;
    }
    t.putInBackground();
    return t;
}