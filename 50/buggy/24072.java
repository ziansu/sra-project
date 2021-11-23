@java.lang.Override
public void updateFilteredListToShowCompleted() {
    updateFilteredTaskList(new seedu.tache.model.ModelManager.PredicateExpression(new seedu.tache.model.ModelManager.ActiveQualifier(false)));
    updateFilteredTaskListType(seedu.tache.model.ModelManager.TASK_LIST_TYPE_COMPLETED);
}