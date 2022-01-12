public int countOverdueTasks() {
    java.time.LocalDateTime now = java.time.LocalDateTime.now();
    int count = 0;
    for (seedu.todo.models.Task task : tasks) {
        if (((!(task.isCompleted())) && ((task.getDueDate()) != null)) && ((task.getDueDate().compareTo(now)) < 0))
            count++;
        
    }
    return count;
}