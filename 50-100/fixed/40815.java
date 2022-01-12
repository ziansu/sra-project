public void modifyautosmssms(int id, java.lang.String number, java.lang.String message) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.abezukor.abezukor.autosms.DBHandler.COLUMN_NUMBER, number);
    values.put(com.abezukor.abezukor.autosms.DBHandler.COLUMN_MESSAGE, message);
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.update(com.abezukor.abezukor.autosms.DBHandler.TABLE_AUTOSMSTABLE, values, ("_id=" + (id - 1)), null);
    db.close();
}