@java.lang.SuppressWarnings(value = "deprecation")
private void swapCursor() {
    android.database.Cursor cursor = this.sqlHelper.getCursor();
    int count = cursor.getCount();
    this.adapter.setSelection(new boolean[count]);
    this.stopManagingCursor(this.adapter.getCursor());
    this.startManagingCursor(cursor);
    this.adapter.changeCursor(cursor);
}