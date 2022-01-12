@java.lang.Override
public java.lang.Boolean apply(java.lang.Long bookmarkId) {
    boolean result;
    if (bookmarkId > 0) {
        bookmarksDBAdapter.removeBookmark(bookmarkId);
        result = false;
    }else {
        bookmarksDBAdapter.addBookmark(sura, ayah, page);
        result = true;
    }
    bookmarksPublishSubject.onNext(true);
    return result;
}