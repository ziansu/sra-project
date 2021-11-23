private void addTask(java.lang.String[] addTaskString) {
    com.example.heetel.todo.Task newTask = new com.example.heetel.todo.Task(addTaskString[0], addTaskString[1]);
    if (!(newTask.equals(tasks.get(0)))) {
        tasks.add(0, newTask);
        this.lastTask = newTask;
        android.util.Log.i("addTask", "Task added");
    }else {
        android.util.Log.i("addTask", "equal Task not added");
    }
}