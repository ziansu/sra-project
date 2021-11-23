public void clearToDoListInDB() {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.execSQL(("delete from " + (ToDoListContract.ToDoList.TABLE_NAME)));
}