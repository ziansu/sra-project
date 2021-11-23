public java.lang.Integer getNextNum() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.database.Cursor cur = db.rawQuery("SELECT COUNT(*),MAX(num) FROM Transactions", null);
    cur.moveToFirst();
    if ((cur.getInt(0)) == 0) {
        cur.close();
        return 1;
    }
    java.lang.Integer num = cur.getInt(1);
    cur.close();
    return num;
}