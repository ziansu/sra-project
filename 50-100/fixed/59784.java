public void delete(int id) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.execSQL((((((("DELETE FROM " + (com.abezukor.abezukor.autosms.DBHandler.TABLE_AUTOSMSTABLE)) + " WHERE ") + (com.abezukor.abezukor.autosms.DBHandler.COLUMN_ID)) + "=\"") + id) + "\";"));
    db.close();
}