@java.lang.SuppressWarnings(value = "deprecation")
private void swapCursor() {
    android.database.Cursor cursor = this.sqlHelper.getCursor();
    this.adapter.setSelection(new boolean[cursor.getCount()]);
    this.stopManagingCursor(this.adapter.getCursor());
    this.startManagingCursor(cursor);
    this.adapter.changeCursor(cursor);
}