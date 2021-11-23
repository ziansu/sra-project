public void updateRibbon(com.lerenard.bible.Ribbon ribbon) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.update(com.lerenard.bible.helper.DatabaseHandler.TABLE_RIBBONS, getValues(ribbon), ((com.lerenard.bible.helper.DatabaseHandler._ID) + " = ?"), new java.lang.String[]{ java.lang.Long.toString(ribbon.getId()) });
}