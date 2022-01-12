public void run() {
    taskName.setText(updatedTask.getName());
    taskDescription.setText(updatedTask.getDescription());
    taskStatus.setText(updatedTask.getStatus().toString());
    taskLastModifiedAt.setText(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(task.getLastModifiedAt()));
}