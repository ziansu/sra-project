@java.lang.Override
public void onSubscribe(@android.support.annotation.NonNull
acr.browser.lightning.react.Subscriber<acr.browser.lightning.fragment.BookmarksFragment.BookmarkViewAdapter> subscriber) {
    android.content.Context context = getContext();
    if (context != null) {
        mBookmarkAdapter = new acr.browser.lightning.fragment.BookmarksFragment.BookmarkViewAdapter(getContext(), mBookmarks);
        setBookmarkDataSet(mBookmarkManager.getBookmarksFromFolder(null, true), false);
        subscriber.onNext(mBookmarkAdapter);
    }
    subscriber.onComplete();
}