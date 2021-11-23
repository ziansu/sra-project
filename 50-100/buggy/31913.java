@java.lang.Override
public void openBookmark(org.chromium.components.bookmarks.BookmarkId bookmark, int launchLocation) {
    clearSelection();
    if ((mEnhancedBookmarksModel.getBookmarkById(bookmark)) != null) {
        java.lang.String url = mEnhancedBookmarksModel.getLaunchUrlAndMarkAccessed(bookmark);
        if (android.text.TextUtils.isEmpty(url))
            return ;
        
        org.chromium.chrome.browser.ntp.NewTabPageUma.recordAction(NewTabPageUma.ACTION_OPENED_BOOKMARK);
        org.chromium.base.metrics.RecordHistogram.recordEnumeratedHistogram("Stars.LaunchLocation", launchLocation, LaunchLocation.COUNT);
        org.chromium.chrome.browser.enhancedbookmarks.EnhancedBookmarkUtils.openBookmark(mActivity, url);
        org.chromium.chrome.browser.enhancedbookmarks.EnhancedBookmarkUtils.finishActivityOnPhone(mActivity);
    }
}