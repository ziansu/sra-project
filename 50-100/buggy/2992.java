public com.example.kienhoang.habitapp.Habit getHabitById(int id) {
    com.example.kienhoang.habitapp.Habit habit = null;
    android.database.Cursor cursor = this.fetchBySelection(com.example.kienhoang.habitapp.DatabaseHandler.TABLE_HABITS, new java.lang.String[]{ DatabaseAttributes.ID }, new java.lang.String[]{ java.lang.Integer.toString(id) });
    if (isNonEmptyCursor(cursor)) {
        cursor.moveToFirst();
        habit = new com.example.kienhoang.habitapp.Habit(cursor.getInt(0), null, cursor.getString(2), cursor.getInt(3), cursor.getInt(4));
    }
    return habit;
}