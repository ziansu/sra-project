private java.util.ArrayList<taskie.models.Task> findUndoneTasks(java.util.ArrayList<taskie.models.Task> tasks) {
    java.util.ArrayList<taskie.models.Task> tasksToDisplay = new java.util.ArrayList<taskie.models.Task>();
    for (taskie.models.Task task : tasks) {
        if (!(task.isDone())) {
            tasksToDisplay.add(task);
        }
    }
    return tasksToDisplay;
}