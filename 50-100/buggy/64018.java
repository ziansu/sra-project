public int getTaskCount() {
    java.lang.String countQuery = "SELECT * FROM " + (com.qucrush.android.crushingitapp.DBHandler.TABLE_TASKS);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cur = db.rawQuery(countQuery, null);
    int num = cur.getCount();
    cur.close();
    db.close();
    java.lang.System.out.println(num);
    return num;
}