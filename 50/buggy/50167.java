public static org.chromium.chrome.browser.offlinepages.ClientId createClientIdForBookmarkId(org.chromium.components.bookmarks.BookmarkId id) {
    return new org.chromium.chrome.browser.offlinepages.ClientId(OfflinePageBridge.BOOKMARK_NAMESPACE, id.toString());
}