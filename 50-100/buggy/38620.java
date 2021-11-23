public android.database.Cursor SelectModelInFilter(java.lang.String modelfilter) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    java.lang.String filter = (((com.int10.belt.dbHelper.FIELD_MODEL) + " like '%") + modelfilter) + "%'";
    android.database.Cursor cursor = db.query(com.int10.belt.dbHelper.TABLE_NAME, null, filter, null, null, null, "_id");
    return cursor;
}