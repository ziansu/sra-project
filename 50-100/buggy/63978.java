@java.lang.Override
public synchronized void deleteTasksDate(seedu.taskmanager.commons.core.UnmodifiableObservableList<seedu.taskmanager.model.task.ReadOnlyTask> targets) throws seedu.taskmanager.model.task.UniqueTaskList.TaskNotFoundException {
    while ((targets.size()) != 0) {
        try {
            seedu.taskmanager.model.task.ReadOnlyTask taskToDelete = targets.get(0);
            saveInstance();
            taskManager.removeTask(taskToDelete);
        } catch (seedu.taskmanager.model.task.UniqueTaskList.TaskNotFoundException pnfe) {
            assert false : "The target task cannot be missing";
        }
    } 
    updateFilteredListToShowAll();
    indicateTaskManagerChanged();
}