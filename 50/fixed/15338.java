public void updateTask(vn.com.baohq.simpletodo.data.TaskItem taskItem) {
    android.content.ContentValues values = getContentValues(taskItem);
    vn.com.baohq.simpletodo.data.DataManager.mDbHelper.update(TaskEntry.TABLE_NAME, values, ((TaskEntry.COLUMN_TASK_ID) + " = ?"), new java.lang.String[]{ taskItem.getId().toString() });
}