public static void addEngineToDb(android.database.sqlite.SQLiteDatabase db, rikka.searchbyimage.staticdata.CustomEngineParcelable parcelable, int id) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(CustomEngineTable.COLUMN_ID, id);
    values.put(CustomEngineTable.COLUMN_ENABLED, 1);
    values.put(CustomEngineTable.COLUMN_DATA, rikka.searchbyimage.utils.ParcelableUtils.marshall(parcelable));
    db.insert(CustomEngineTable.TABLE_NAME, null, values);
}