@java.lang.Override
public void updateFilteredListToShowCompleted() {
    updateFilteredTaskListType(seedu.tache.model.ModelManager.TASK_LIST_TYPE_COMPLETED);
    updateFilteredTaskList(new seedu.tache.model.ModelManager.PredicateExpression(new seedu.tache.model.ModelManager.ActiveQualifier(false)));
}