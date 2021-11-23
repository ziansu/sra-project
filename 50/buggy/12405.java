public void swapCursor(android.database.Cursor cursor) {
    this.mCursor = cursor;
    notifyDataSetChanged();
}