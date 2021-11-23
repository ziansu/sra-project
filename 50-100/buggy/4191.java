@java.lang.Override
public void handleBookmarksChange() {
    final acr.browser.lightning.view.LightningView currentTab = mTabsManager.getCurrentTab();
    if ((currentTab != null) && (acr.browser.lightning.utils.UrlUtils.isBookmarkUrl(currentTab.getUrl()))) {
        currentTab.loadBookmarkpage();
    }
    if (currentTab != null) {
        mBookmarksView.handleUpdatedUrl(currentTab.getUrl());
    }
}