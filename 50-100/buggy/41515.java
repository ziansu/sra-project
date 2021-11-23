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
        notifyItemRangeRemoved(cc.solart.turbo.BaseCursorAdapter.getHeaderViewCount(), oldCursor.getCount());
    }
    return oldCursor;
}