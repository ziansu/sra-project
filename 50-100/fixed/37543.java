public void add(seedu.ticktask.model.task.ReadOnlyTask toAdd) throws seedu.ticktask.model.task.exceptions.DuplicateTaskException {
    java.util.Objects.requireNonNull(toAdd);
    if (contains(toAdd)) {
        throw new seedu.ticktask.model.task.exceptions.DuplicateTaskException();
    }
    if ((toAdd.getTaskType().toString().equals("event")) && (eventClash(toAdd, null))) {
        throw new seedu.ticktask.model.task.exceptions.DuplicateTaskException();
    }
    toAdd.resetTaskType();
    internalList.add(new seedu.ticktask.model.task.Task(toAdd));
}