@java.lang.Override
public boolean isEnabled(int position) {
    if (((mDelegate) == null) || ((mDelegate.getModel()) == null))
        return false;
    
    if (position == (MOVE_POSITION)) {
        org.chromium.chrome.browser.bookmarks.BookmarkBridge.BookmarkItem bookmark = mDelegate.getModel().getBookmarkById(mBookmarkId);
        if (bookmark == null)
            return false;
        
        return bookmark.isMovable();
    }
    return true;
}