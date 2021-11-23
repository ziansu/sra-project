public android.database.Cursor swapCursor(android.database.Cursor newCursor) {
    if (newCursor == (mCursor)) {
        return null;
    }
    android.database.Cursor oldCursor = mCursor;
    mCursor = newCursor;
    if (newCursor != null) {
        mRowIDColumn = newCursor.getColumnIndexOrThrow("_id");
        mDataValid = true;
        cc.solart.turbo.BaseCursorAdapter.notifyDataSetChanged();
    }else {
        mRowIDColumn = -1;
        mDataValid = false;
        cc.solart.turbo.BaseCursorAdapter.notifyDataSetChanged();
    }
    return oldCursor;
}