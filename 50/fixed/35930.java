public void changeTaskStatus(java.util.UUID uuid, java.lang.String status) {
    vn.com.baohq.simpletodo.data.TaskItem taskItem = getTaskById(uuid);
    taskItem.setStatus(status);
    updateTask(taskItem);
}