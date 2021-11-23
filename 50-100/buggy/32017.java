public boolean add(todolist.model.Task task) throws java.io.IOException {
    if (isExistingTask(task)) {
        todolist.model.DataBase.dataBase_Logger.log(java.util.logging.Level.INFO, ((todolist.model.DataBase.LOGGING_REPEATED_TASK) + (task.getName().getName())));
        throw new java.io.IOException(todolist.model.DataBase.EXCEPEPTION_REPEATED_TASK);
    }
    todolist.model.DataBase.dataBase_Logger.log(java.util.logging.Level.INFO, ((todolist.model.DataBase.LOGGING_ADDING_TASK) + (task.getName().getName())));
    taskList.add(0, task);
    snapshot.add(taskList);
    writeToFile();
    return true;
}