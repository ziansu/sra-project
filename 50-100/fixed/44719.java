public void addTaskToList(java.lang.String task) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.corneeldenhartogh.corneel_pset4.DataBaseHelper.COLUMN_TASK, task);
    db.insert(com.example.corneeldenhartogh.corneel_pset4.DataBaseHelper.TABLE_TODOLIST, null, values);
    db.close();
}