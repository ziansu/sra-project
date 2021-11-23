public int addworkout(java.lang.String name) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("name", name);
    try {
        db.insertOrThrow("workout", null, values);
    } catch (jeffdev.workingset.android e) {
        return 1;
    }
    db.close();
    return 0;
}