public android.database.Cursor getCursor() {
    android.database.Cursor c = database.query(DBHelper.USER_TABLE, new java.lang.String[]{ DBHelper.USER_NAME_COLUMN , DBHelper.USER_PASSWORD_COLUMN }, null, null, null, null, null);
    return c;
}