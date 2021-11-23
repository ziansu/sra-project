public void addDayCheck(java.lang.String millisIdentifier, java.lang.String date, int doneState) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(net.coffeewarriors.just10minutes.data.TasksContract.COLUMN_DATE, date);
    values.put(net.coffeewarriors.just10minutes.data.TasksContract.COLUMN_DONE_STATE, doneState);
    db.insert(millisIdentifier, null, values);
    db.close();
}