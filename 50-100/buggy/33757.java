public void changeTaskStatusInDB(java.lang.String taskDesc, java.util.Date date, boolean isCompleted) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(ToDoListContract.ToDoList.COLUMN_NAME_STATUS, (isCompleted + ""));
    java.lang.String selection = (((ToDoListContract.ToDoList.COLUMN_NAME_TASK_DESCRIPTION) + " LIKE ? and ") + (ToDoListContract.ToDoList.COLUMN_NAME_DATE)) + " LIKE ?";
    java.lang.String[] selectionArgs = new java.lang.String[]{ taskDesc , (date.getTime()) + "" };
    db.update(ToDoListContract.ToDoList.TABLE_NAME, values, selection, selectionArgs);
}