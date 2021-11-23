public boolean set(int key, seedu.address.model.task.Task toSet) throws seedu.address.model.task.UniqueTaskList.TaskNotFoundException {
    assert toSet != null;
    boolean isFound = false;
    if ((internalList.size()) < key) {
        throw new seedu.address.model.task.UniqueTaskList.TaskNotFoundException();
    }else {
        internalList.set(key, toSet);
        isFound = true;
    }
    return isFound;
}