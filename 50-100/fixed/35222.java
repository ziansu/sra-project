@java.lang.Override
public void updateFilteredTaskList(java.util.Set<java.lang.String> keywords) {
    assert keywords != null;
    updateFilteredTaskListType(seedu.tache.model.ModelManager.TASK_LIST_TYPE_FOUND);
    updateFilteredTaskList(new seedu.tache.model.ModelManager.PredicateExpression(new seedu.tache.model.ModelManager.MultiQualifier(keywords)));
    retainLatestKeywords(keywords);
    raise(new seedu.tache.commons.events.ui.TaskListTypeChangedEvent((("Find \"" + (seedu.tache.commons.util.StringUtil.generateStringFromKeywords(keywords))) + "\"")));
}