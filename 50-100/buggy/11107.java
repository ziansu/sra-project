public void add(seedu.taskboss.model.task.Task toAdd) throws seedu.taskboss.model.task.UniqueTaskList.DuplicateTaskException {
    assert toAdd != null;
    if (contains(toAdd)) {
        if (!(toAdd.getCategories().contains(Category.done))) {
            throw new seedu.taskboss.model.task.UniqueTaskList.DuplicateTaskException();
        }
    }
    internalList.add(toAdd);
}