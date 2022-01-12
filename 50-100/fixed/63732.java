@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    super.onInsertComplete(token, cookie, uri);
    if (cookie == null) {
        mCallback = null;
        return ;
    }
    if (cookie.equals(mItemId)) {
        mCallback.onInsertComplete();
        mCallback = null;
    }
}