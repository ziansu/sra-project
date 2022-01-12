public int getTasksCount() {
    java.lang.String countQuery = "SELECT * FROM " + (nudelsquad.nudelcalendar.DBHandler.TABLE_TASKS);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(countQuery, null);
    cursor.close();
    return cursor.getCount();
}