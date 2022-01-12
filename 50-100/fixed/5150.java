public void addFriend(ch.riverworld.collector.DatabaseOperations dop, java.lang.String firstName, java.lang.String lastName) {
    android.database.sqlite.SQLiteDatabase db = dop.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(DatabaseInfo.FRIENDS_FIRSTNAME_COL, firstName);
    values.put(DatabaseInfo.FRIENDS_LASTNAME_COL, lastName);
    db.insert(DatabaseInfo.FRIENDS_TABLE, null, values);
    if (debugMode) {
        android.util.Log.d("DATABASE", "Table friends --> added one line.");
    }
}