public int getTasksCount() {
    java.lang.String countQuery = "SELECT * FROM " + (nudelsquad.nudelcalendar.DBHandler.TABLE_TASKS);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(countQuery, null);
    int count = cursor.getCount();
    cursor.close();
    return count;
}