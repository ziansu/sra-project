public void addRecord(java.lang.String record) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.toms.karogi.DatabaseHandler.RECORDS, record);
    db.insert(com.example.toms.karogi.DatabaseHandler.RECORDS_TABLE, null, values);
    db.close();
}