private void fetchHabits() {
    com.example.giddu.habittrackerapp.HabitDbHelper mDbHelper = new com.example.giddu.habittrackerapp.HabitDbHelper(this);
    android.database.sqlite.SQLiteDatabase db = mDbHelper.getReadableDatabase();
    java.lang.String[] projection = new java.lang.String[]{ com.example.giddu.habittrackerapp.HabitContract.HabitEntry._ID , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_CALORIES , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_DAY , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_SLEEP , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_STEPS , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_WALK_DOG_TIME , com.example.giddu.habittrackerapp.HabitContract.HabitEntry.COLUMN_MOOD };
    android.database.Cursor cursor = db.query(HabitEntry.TABLE_NAME, projection, null, null, null, null, null);
}