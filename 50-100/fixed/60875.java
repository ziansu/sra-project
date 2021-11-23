public void editTask(int id, java.lang.String task) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.corneeldenhartogh.corneel_pset4.DataBaseHelper.COLUMN_TASK, task);
    db.update(com.example.corneeldenhartogh.corneel_pset4.DataBaseHelper.TABLE_TODOLIST, values, ((com.example.corneeldenhartogh.corneel_pset4.DataBaseHelper.COLUMN_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(id) });
    db.close();
}