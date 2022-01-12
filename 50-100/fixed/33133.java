public boolean AddNewReading(com.example.m5.oximetergui.Data_Objects.Reading data) {
    android.database.sqlite.SQLiteDatabase db = _dal.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(SQL_Constants.DATA_READINGDATA_COLUMN, data.DataString);
    values.put(SQL_Constants.DATA_ISSYNCED_COLUMN, (data.IsSynced ? 1 : 0));
    db.insertOrThrow(SQL_Constants.DATA_TABLE_NAME, null, values);
    return true;
}