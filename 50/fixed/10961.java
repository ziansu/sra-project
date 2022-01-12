@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    mCallback.onInsertComplete();
    mCallback = null;
}