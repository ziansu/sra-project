@java.lang.Override
public void updateFilteredListToShowAll() {
    seedu.address.logic.RecurringTaskManager.getInstance().updateAnyRecurringTasks();
    filteredTaskComponents.setPredicate(new seedu.address.model.ModelManager.PredicateExpression(new seedu.address.model.ModelManager.ArchiveQualifier(true))::unsatisfies);
}