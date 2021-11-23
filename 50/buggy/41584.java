public void deleteData(java.lang.String ID) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    db.execSQL(("DELETE FROM Reminder_tabledb WHERE _id =" + ID));
}