public void setRecurringTasksToDisplay(taskcommando.logic.datastructures.TaskList recurringTasksToDisplay) {
    this.recurringTasksToDisplay = recurringTasksToDisplay;
    if ((recurringTasksToDisplay.size()) != 0) {
        this.headerToDisplay = taskcommando.logic.datastructures.UiSettings.VIEW_HEADER_RECURRING;
    }
}