public static java.util.ArrayList<java.lang.Integer> addNewTask(logic.Task newTask, int taskListPosition) throws java.io.IOException {
    Storage.Storage.logger.log(java.util.logging.Level.INFO, ("Adding new Task to the ArrayList at position: " + taskListPosition));
    Storage.Storage.taskList.add((taskListPosition - 1), newTask);
    Storage.Storage.saveTaskList();
    Storage.Storage.displayAllTasks();
    return Storage.Storage.indexList;
}