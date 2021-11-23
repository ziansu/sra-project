public void addTodoTaskToDB(iu.i527.shalaka.todolistapp.ToDoTask task) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(ToDoListContract.ToDoList.COLUMN_NAME_TASK_DESCRIPTION, task.getTask_description());
    values.put(ToDoListContract.ToDoList.COLUMN_NAME_DATE, ((task.getDate().getTime()) + ""));
    values.put(ToDoListContract.ToDoList.COLUMN_NAME_STATUS, ((task.isStatus()) + ""));
    db.insert(ToDoListContract.ToDoList.TABLE_NAME, null, values);
}