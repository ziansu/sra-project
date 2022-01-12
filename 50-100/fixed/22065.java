public void getTask(android.view.View listItem) {
    com.example.natashaford.todolist.Task task = ((com.example.natashaford.todolist.Task) (listItem.getTag()));
    android.util.Log.d("Task title: ", task.getTitle());
    android.content.Intent intent = new android.content.Intent(this, com.example.natashaford.todolist.TaskActivity.class);
    startActivity(intent);
}