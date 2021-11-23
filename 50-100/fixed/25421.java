public void onIconUpdated(final java.lang.String url) {
    if ((mMostVisitedItems) == null)
        return ;
    
    for (org.chromium.chrome.browser.ntp.MostVisitedItem item : mMostVisitedItems) {
        if (item.getUrl().equals(url)) {
            org.chromium.chrome.browser.favicon.LargeIconBridge.LargeIconCallback iconCallback = new org.chromium.chrome.browser.ntp.NewTabPageView.MostVisitedDesign.LargeIconCallbackImpl(item, false);
            mManager.getLargeIconForUrl(url, mMinIconSize, iconCallback);
            break;
        }
    }
}