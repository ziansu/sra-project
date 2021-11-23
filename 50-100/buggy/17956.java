public android.database.Cursor SelectModelInSerial(java.lang.String serial) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.int10.belt.dbHelper.TABLE_NAME, new java.lang.String[]{ "_id" , com.int10.belt.dbHelper.FIELD_MODEL }, ((((com.int10.belt.dbHelper.FIELD_SERIAL) + "='") + serial) + "'"), null, null, null, "_id");
    return cursor;
}