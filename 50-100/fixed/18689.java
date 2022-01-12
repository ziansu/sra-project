public void updateTask(seedu.tache.model.task.ReadOnlyTask readOnlyTaskToUpdate, seedu.tache.model.task.ReadOnlyTask editedTask) throws seedu.tache.model.task.UniqueTaskList.DuplicateTaskException {
    assert editedTask != null;
    assert readOnlyTaskToUpdate instanceof seedu.tache.model.task.Task;
    seedu.tache.model.task.Task taskToUpdate = ((seedu.tache.model.task.Task) (readOnlyTaskToUpdate));
    if ((!(taskToUpdate.equals(editedTask))) && (internalList.contains(editedTask))) {
        throw new seedu.tache.model.task.UniqueTaskList.DuplicateTaskException();
    }
    int index = internalList.indexOf(taskToUpdate);
    taskToUpdate.resetData(editedTask);
    internalList.set(index, taskToUpdate);
}