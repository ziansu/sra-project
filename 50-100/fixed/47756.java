public com.lerenard.bible.Ribbon getRibbon(int id) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.query(com.lerenard.bible.helper.DatabaseHandler.TABLE_RIBBONS, com.lerenard.bible.helper.DatabaseHandler.star, ((com.lerenard.bible.helper.DatabaseHandler._ID) + " = ?"), new java.lang.String[]{ java.lang.Integer.toString(id) }, null, null, null);
    cursor.moveToFirst();
    com.lerenard.bible.Ribbon ribbon = getRibbon(cursor);
    cursor.close();
    return ribbon;
}