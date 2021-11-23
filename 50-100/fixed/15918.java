public int getNumRows() {
    int count = 0;
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query("testTable", null, null, null, null, null, null);
    if (cursor != null) {
        if (cursor.moveToFirst()) {
            while (!(cursor.isAfterLast())) {
                count++;
                cursor.moveToNext();
            } 
        }
    }
    cursor.close();
    return count;
}