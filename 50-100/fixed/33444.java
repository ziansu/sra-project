private int findLastLogId() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.database.Cursor cursor = db.query(com.home.moorre.myapplication.DB.MyDBHandler.TABLE_LOGS, new java.lang.String[]{ com.home.moorre.myapplication.DB.MyDBHandler.COL_ID }, null, null, null, null, null);
    cursor.moveToLast();
    int id = cursor.getInt(0);
    cursor.close();
    db.close();
    return id;
}