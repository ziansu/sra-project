public android.database.Cursor getAllPeopleByCollege(java.lang.String college) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.query(Person.TABLE_NAME, null, ((Person.COL_COLLEGE) + " =? "), new java.lang.String[]{ college }, null, null, ((Person.COL_NAME) + " ASC"));
    return cursor;
}