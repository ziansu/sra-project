public android.database.Cursor getCursor() {
    android.database.Cursor c = database.query(DBHelper.USER_TABLE, null, null, null, null, null, null);
    return c;
}