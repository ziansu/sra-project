public boolean userIsExist(java.lang.String name) {
    java.lang.String QUERY = ((((((("SELECT " + (com.shpp.sv.sqlite.UserDatabaseHelper.KEY_USER_NAME)) + " FROM ") + (com.shpp.sv.sqlite.UserDatabaseHelper.TABLE_USERS)) + " WHERE ") + (com.shpp.sv.sqlite.UserDatabaseHelper.KEY_USER_NAME)) + " = \"") + name) + "\"";
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(QUERY, null);
    boolean result = cursor.moveToFirst();
    cursor.close();
    return result;
}