@java.lang.Override
public void sortTasks(seedu.taskboss.model.task.UniqueTaskList.SortBy sortType) throws seedu.taskboss.commons.exceptions.IllegalValueException {
    assert sortType != null;
    this.currentSortType = sortType;
    taskBoss.sortTasks(sortType);
    indicateTaskBossChanged();
}