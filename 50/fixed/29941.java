@java.lang.Override
public void updateFilteredListToShowUncompleted() {
    updateFilteredTaskListType(seedu.tache.model.ModelManager.TASK_LIST_TYPE_UNCOMPLETED);
    updateFilteredTaskList(new seedu.tache.model.ModelManager.PredicateExpression(new seedu.tache.model.ModelManager.ActiveQualifier(true)));
}