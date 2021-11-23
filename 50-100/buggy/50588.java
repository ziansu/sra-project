private void insertRow(int habitName, java.lang.String timestamp) {
    android.database.sqlite.SQLiteDatabase db = mDBHelper.getWritableDatabase();
    android.content.ContentValues habit_row = new android.content.ContentValues();
    habit_row.put(HabitsEntry.COL_HABIT, habitName);
    habit_row.put(HabitsEntry.COL_TIMESTAMP, timestamp);
    long newRowId = db.insert(HabitsEntry.TABLE_NAME, null, habit_row);
    android.util.Log.i("Row inserted!", (" Returned ID:" + newRowId));
}