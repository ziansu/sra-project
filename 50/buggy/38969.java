@java.lang.Override
public void updateFilteredListToShowAll() {
    filteredTasks.setPredicate(null);
    raise(new seedu.tache.commons.events.ui.FilteredTaskListUpdatedEvent(getFilteredTaskList()));
    updateFilteredTaskListType(seedu.tache.model.ModelManager.TASK_LIST_TYPE_ALL);
}