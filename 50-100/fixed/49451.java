@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.lerenard.bible.helper.DatabaseHandler.CREATE_TABLE_RIBBONS);
    com.lerenard.bible.Ribbon firstRibbon = new com.lerenard.bible.Ribbon(com.lerenard.bible.Reference.getDefault(), "Personal Reading");
    android.content.ContentValues values = getValues(firstRibbon);
    values.put(com.lerenard.bible.helper.DatabaseHandler.RIBBONS_POSITION_IN_LIST, 0);
    db.insert(com.lerenard.bible.helper.DatabaseHandler.TABLE_RIBBONS, null, values);
}