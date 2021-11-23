public void deleteTable(java.lang.String milliIdentifier) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String SQL_DELETE_TABLE = ("DROP TABLE " + milliIdentifier) + ";";
    db.execSQL(SQL_DELETE_TABLE);
}