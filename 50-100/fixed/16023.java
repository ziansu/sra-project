@java.lang.Override
public synchronized void addTask(seedu.agendum.model.task.Task task) throws seedu.agendum.model.task.UniqueTaskList.DuplicateTaskException {
    toDoList.addTask(task);
    seedu.agendum.model.ModelManager.logger.fine("[MODEL] --- succesfully added the new task to the to-do list");
    if (!(task.isChild())) {
        backupNewToDoList();
    }
    updateFilteredListToShowAll();
    indicateToDoListChanged();
    seedu.agendum.model.ModelManager.logger.fine("MODEL --- succesfully added the new task to the to-do list");
}