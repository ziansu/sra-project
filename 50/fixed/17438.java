public android.database.Cursor getData() {
    android.database.Cursor cursor = db.query(HabitContract.HabitEntry.TABLE, null, null, null, null, null, null);
    cursor.moveToFirst();
    return cursor;
}