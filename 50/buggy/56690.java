@java.lang.Override
public synchronized void completeTask(seedu.jobs.model.task.ReadOnlyTask target) throws seedu.jobs.model.task.UniqueTaskList.TaskNotFoundException {
    taskBook.completeTask(target);
    indicateTaskBookChanged();
}