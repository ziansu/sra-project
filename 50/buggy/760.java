private void updateFilteredTaskList(seedu.address.model.ModelManager.Expression expression) {
    seedu.address.logic.RecurringTaskManager.getInstance().updateAnyRecurringTasks();
    filteredTaskComponents.setPredicate(expression::satisfies);
}