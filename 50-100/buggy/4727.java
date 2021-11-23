public void updateTask(int index, seedu.taskit.model.task.ReadOnlyTask editedTask) throws seedu.taskit.model.task.UniqueTaskList.DuplicateTaskException {
    assert editedTask != null;
    seedu.taskit.model.task.Task taskToUpdate = internalList.get(index);
    if ((taskToUpdate.equals(editedTask)) && (internalList.contains(editedTask))) {
        throw new seedu.taskit.model.task.UniqueTaskList.DuplicateTaskException();
    }
    taskToUpdate.resetData(editedTask);
    internalList.set(index, taskToUpdate);
    sortTasks();
}