@java.lang.Override
protected void onQueryComplete(int token, java.lang.Object cookie, android.database.Cursor cursor) {
    super.onQueryComplete(token, cookie, cursor);
    if (cookie == null) {
        mCallback = null;
        return ;
    }
    if (cookie.equals(mItemId)) {
        mCallback.onQueryComplete(((cursor != null) && ((cursor.getCount()) > 0)));
        mCallback = null;
    }
}