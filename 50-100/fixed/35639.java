public void deleteFromDatabase(java.lang.String taskDesc, java.lang.String date) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String selection = (((ToDoListContract.ToDoList.COLUMN_NAME_TASK_DESCRIPTION) + " LIKE ? and ") + (ToDoListContract.ToDoList.COLUMN_NAME_DATE)) + " LIKE ?";
    java.lang.String[] selectionArgs = new java.lang.String[]{ taskDesc , date };
    db.delete(ToDoListContract.ToDoList.TABLE_NAME, selection, selectionArgs);
}