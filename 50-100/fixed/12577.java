public void updateTask(int index, seedu.taskboss.model.task.ReadOnlyTask editedTask) throws seedu.taskboss.model.task.UniqueTaskList.DuplicateTaskException {
    assert editedTask != null;
    seedu.taskboss.model.task.Task taskToUpdate = internalList.get(index);
    if (((!(taskToUpdate.equals(editedTask))) && (internalList.contains(editedTask))) && (!(editedTask.getCategories().contains(Category.done)))) {
        throw new seedu.taskboss.model.task.UniqueTaskList.DuplicateTaskException();
    }
    taskToUpdate.resetData(editedTask);
    internalList.set(index, taskToUpdate);
}