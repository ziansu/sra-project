public android.database.Cursor swapCursor(android.database.Cursor newCursor) {
    final android.database.Cursor oldCursor = mCursor;
    if (oldCursor != null) {
        oldCursor.unregisterDataSetObserver(mDataObserver);
    }
    mCursor = newCursor;
    if ((mCursor) != null) {
        newCursor.registerDataSetObserver(mDataObserver);
        mRowIdColumnIndex = newCursor.getColumnIndexOrThrow(mRowIDColumn);
        mDataValid = true;
    }else {
        mRowIdColumnIndex = -1;
        mDataValid = false;
    }
    notifyDataSetChanged();
    return oldCursor;
}