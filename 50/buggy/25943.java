private void dataBaseAdd(todolist.model.Task task) {
    try {
        dataBase.add(task);
        logic.writeLog(((todolist.model.NormalCommandHandler.LOGGING_ADDING_TASK) + (task.getName().getName())));
    } catch (java.io.IOException e) {
    }
}