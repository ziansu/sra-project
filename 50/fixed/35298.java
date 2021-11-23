public android.database.Cursor swapCursor(android.database.Cursor cursor) {
    if ((mCursor) == cursor)
        return null;
    
    android.database.Cursor tempCursor = mCursor;
    mCursor = cursor;
    if (cursor != null)
        notifyDataSetChanged();
    
    return tempCursor;
}