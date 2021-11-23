public void addNewTask(application.Task taskToAdd) {
    searchList.clear();
    taskList.add(taskToAdd);
    sort();
    file.clear();
    file.saveToFile(tasksToStrings());
}