public boolean insertData_registerCaregiver(java.lang.String first_name, java.lang.String last_name, java.lang.String username, java.lang.String password) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(lehigh.cse.memcare.DatabaseHelper.COLUMN_2, first_name);
    contentValues.put(lehigh.cse.memcare.DatabaseHelper.COLUMN_3, last_name);
    contentValues.put(lehigh.cse.memcare.DatabaseHelper.COLUMN_4, username);
    contentValues.put(lehigh.cse.memcare.DatabaseHelper.COLUMN_5, password);
    long result = db.insert(lehigh.cse.memcare.DatabaseHelper.TABLE_NAME, null, contentValues);
    return result != (-1);
}