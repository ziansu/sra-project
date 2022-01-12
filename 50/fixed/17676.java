@java.lang.Override
public synchronized void addTask(seedu.address.model.task.Task task) throws UniqueTaskList.DuplicateTaskException, seedu.address.model.task.UniqueTaskList.TimeslotOverlapException {
    taskMaster.addTask(task);
    updateFilteredListToShowAll();
    indicateTaskListChanged();
}