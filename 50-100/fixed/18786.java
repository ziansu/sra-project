public void updateDaysIncomplete(int id, java.lang.String date) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(((((((("UPDATE TASKS SET " + (com.qucrush.android.crushingitapp.DBHandler.KEY_DAYS_INCOMPLETE)) + " = '") + date) + "' WHERE ") + (com.qucrush.android.crushingitapp.DBHandler.KEY_ID)) + " = ") + id));
}