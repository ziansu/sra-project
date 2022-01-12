@java.lang.Override
public seedu.ggist.commons.core.UnmodifiableObservableList<seedu.ggist.model.task.ReadOnlyTask> getSortedTaskList() {
    sortFilteredList();
    return new seedu.ggist.commons.core.UnmodifiableObservableList(sortedTasks);
}