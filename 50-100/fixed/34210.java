public int addmakeup(java.lang.String Ename, java.lang.String Wname) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("Ename", Ename);
    values.put("Wname", Wname);
    try {
        db.insertOrThrow("makeup", null, values);
    } catch (jeffdev.workingset.android e) {
        db.close();
        return 1;
    }
    db.close();
    return 0;
}