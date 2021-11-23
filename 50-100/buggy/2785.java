public void populateArrayItems(android.database.Cursor data) {
    if ((data.getCount()) == 0) {
        android.widget.Toast.makeText(this, "Todo list is empty!", Toast.LENGTH_SHORT).show();
    }
    adapterTodoTasks.clear();
    while (data.moveToNext()) {
        com.example.mourad.todo.TodoTask task = new com.example.mourad.todo.TodoTask(data.getString(1), data.getInt(6), data.getString(5), data.getInt(2));
        adapterTodoTasks.add(task);
    } 
}