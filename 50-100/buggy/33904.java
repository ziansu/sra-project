@java.lang.Override
protected void onQueryComplete(int token, java.lang.Object cookie, android.database.Cursor cursor) {
    super.onQueryComplete(token, cookie, cursor);
    if (cookie == null) {
        return ;
    }
    if ((mCallback.get()) == null) {
        return ;
    }
    if (cookie.equals(mItemId)) {
        mCallback.get().onQueryComplete(((cursor.getCount()) > 0));
    }
}