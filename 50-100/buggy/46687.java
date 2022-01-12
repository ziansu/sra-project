public com.lerenard.bible.Ribbon getLastUsed() {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.query(com.lerenard.bible.helper.DatabaseHandler.TABLE_RIBBONS, com.lerenard.bible.helper.DatabaseHandler.star, ((((((com.lerenard.bible.helper.DatabaseHandler.RIBBONS_LAST_VISITED) + " = (SELECT MAX(") + (com.lerenard.bible.helper.DatabaseHandler.RIBBONS_LAST_VISITED)) + ") FROM ") + (com.lerenard.bible.helper.DatabaseHandler.TABLE_RIBBONS)) + ")"), null, null, null, null);
    cursor.moveToFirst();
    com.lerenard.bible.Ribbon res = getRibbon(cursor);
    cursor.close();
    db.close();
    return res;
}