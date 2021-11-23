public void changeCursor(android.database.Cursor cursor) {
    android.database.Cursor old = mCursor;
    mCursor = cursor;
    mCursor.moveToPosition(0);
    while (mCursor.moveToNext()) {
        android.util.Log.d("Test", ("changeCursor: " + (mCursor.getString(2))));
    } 
    if (cursor == null) {
        notifyDataSetInvalidated();
    }else {
        notifyDataSetChanged();
    }
    if (old != null) {
        old.close();
    }
}