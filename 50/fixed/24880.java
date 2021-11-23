@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    boolean result = bookmarksDBAdapter.importBookmarks(data);
    if (result) {
        bookmarksPublishSubject.onNext(true);
    }
    return result;
}