public boolean isSameTask(seedu.manager.model.task.ReadOnlyTask task) {
    return (((getFullDesc().equals(task.getDesc().getValue())) && (getVenue().equals(task.getVenue().value))) && (getTime().equals(task.getTime().getValue()))) && (getPriority().equals(task.getPriority().getValue()));
}