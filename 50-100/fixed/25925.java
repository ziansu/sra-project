public long deleteAssignment(int id) {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    try {
        int i = db.delete(dbHelper.TABLE_ASSIGNMENTS, (((dbHelper.ASSIGNMENTS__id) + "=") + id), null);
        return db.delete(dbHelper.TABLE_ASSIGNMENTS, (((dbHelper.ASSIGNMENTS__id) + "=") + id), null);
    } catch (java.lang.Exception e) {
        return -1;
    }
}