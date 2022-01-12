public long deleteAssignment(int id) {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    try {
        return db.delete(dbHelper.TABLE_ASSIGNMENTS, (((dbHelper.ASSIGNMENTS__id) + "=") + id), null);
    } catch (java.lang.Exception e) {
        return -1;
    }
}