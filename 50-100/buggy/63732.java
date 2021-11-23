@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    super.onInsertComplete(token, cookie, uri);
    if (cookie == null) {
        return ;
    }
    if ((mCallback.get()) == null) {
        return ;
    }
    if (cookie.equals(mItemId)) {
        mCallback.get().onInsertComplete();
    }
}