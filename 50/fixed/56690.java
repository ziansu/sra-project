@java.lang.Override
public synchronized void completeTask(int index, seedu.jobs.model.task.ReadOnlyTask target) throws seedu.jobs.model.task.UniqueTaskList.TaskNotFoundException {
    taskBook.completeTask(index, target);
    indicateTaskBookChanged();
}