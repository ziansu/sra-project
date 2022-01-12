private com.motivator.cs446.motivator.Task cursorToTask(android.database.Cursor cursor) {
    com.motivator.cs446.motivator.Task task = new com.motivator.cs446.motivator.Task(cursor.getString(1), new java.util.Date(cursor.getInt(2)), Task.State.valueOf(cursor.getString(3)));
    task.id = cursor.getLong(0);
    return task;
}