public vn.com.baohq.simpletodo.data.TaskItem getTaskById(java.util.UUID uuid) {
    java.lang.String where = (TaskEntry.COLUMN_TASK_ID) + " = ?";
    java.lang.String[] whereArgs = new java.lang.String[]{ uuid.toString() };
    return queryTasksBy(where, whereArgs).get(0);
}