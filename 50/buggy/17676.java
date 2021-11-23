@java.lang.Override
public synchronized void addTask(seedu.address.model.task.Task task) throws UniqueTaskList.DuplicateTaskException, seedu.address.model.task.UniqueTaskList.TimeslotOverlapException {
    taskMaster.addTask(task);
    seedu.address.logic.RecurringTaskManager.getInstance().updateAnyRecurringTasks();
    updateFilteredListToShowAll();
    indicateTaskListChanged();
}