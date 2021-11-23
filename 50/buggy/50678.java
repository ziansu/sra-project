@java.lang.Override
public void bookmarkModelChanged() {
    if (mModel.doesBookmarkExist(mBookmarkId)) {
        updateViewContent(true);
    }else {
        org.chromium.base.Log.wtf(org.chromium.chrome.browser.bookmarks.BookmarkEditActivity.TAG, "A partner bookmark might be removed while the user is editing it.", new java.lang.Exception(org.chromium.chrome.browser.bookmarks.BookmarkEditActivity.TAG));
        finish();
    }
}