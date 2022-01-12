public void addSystem(ch.riverworld.collector.DatabaseOperations dop, java.lang.String system) {
    android.database.sqlite.SQLiteDatabase db = dop.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(DatabaseInfo.SYSTEMS_SYSTEM_COL, system);
    db.insert(DatabaseInfo.SYSTEMS_TABLE, null, values);
    if (debugMode) {
        android.util.Log.d("DATABASE", "Table systems --> added one line.");
    }
}