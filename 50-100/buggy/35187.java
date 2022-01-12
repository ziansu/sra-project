public int getUserCount() {
    java.lang.String sql = (("SELECT COUNT(*) FROM " + (com.michael.database.CookieTable.TABLE)) + "GROUP BY ") + (com.michael.database.CookieTable.COLUMN_USER);
    open();
    android.database.Cursor cursor = database.rawQuery(sql, null);
    cursor.moveToFirst();
    int count = cursor.getInt(0);
    cursor.close();
    close();
    android.util.Log.d(com.michael.database.CookieTable.DEBUG_TAG, (("found " + count) + "users in db"));
    return count;
}