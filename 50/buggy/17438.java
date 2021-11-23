public android.database.Cursor getData() {
    android.database.Cursor cursor = db.rawQuery(("SELECT * FROM " + (HabitContract.HabitEntry.TABLE)), null);
    cursor.moveToFirst();
    return cursor;
}