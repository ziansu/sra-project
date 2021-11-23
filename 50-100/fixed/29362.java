private int findSortedPositionToAdd(seedu.taskmanager.model.task.Task toAdd) {
    int addIndex = 0;
    if (!(internalList.isEmpty())) {
        if (toAdd.isEventTask()) {
            addIndex = findSortedPositionToAddEvents(toAdd);
        }
        if (toAdd.isDeadlineTask()) {
            addIndex = findSortedPositionToAddDeadlines(toAdd);
        }
        if (toAdd.isFloatingTask()) {
            addIndex = internalList.size();
        }
    }
    return addIndex;
}