private int updateToDo(android.database.sqlite.SQLiteDatabase db, int year, int month, int day, java.lang.String description, long id) {
    java.lang.String duedate = formatDate(year, month, day);
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(Contract.TABLE_TODO.COLUMN_NAME_DESCRIPTION, description);
    cv.put(Contract.TABLE_TODO.COLUMN_NAME_DUE_DATE, duedate);
    return db.update(Contract.TABLE_TODO.TABLE_NAME, cv, (((Contract.TABLE_TODO._ID) + "=") + id), null);
}