public android.database.Cursor SelectModelInFilter(java.lang.String modelfilter) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    java.lang.String filter = (((com.int10.belt.dbHelper.FIELD_MODEL) + " like '%") + modelfilter) + "%'";
    android.database.Cursor cursor = db.query(com.int10.belt.dbHelper.TABLE_NAME, new java.lang.String[]{ "_id" , com.int10.belt.dbHelper.FIELD_MODEL }, filter, null, com.int10.belt.dbHelper.FIELD_MODEL, null, "_id");
    return cursor;
}