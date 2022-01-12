@java.lang.Override
public synchronized int isBlockedOutTime(seedu.taskmanager.model.task.Task t) throws UniqueTaskList.DuplicateTaskException {
    int index = 0;
    while (index < (filteredTasks.size())) {
        if (((filteredTasks.get(index).isEventTask()) && (!(filteredTasks.get(index).getIsMarkedAsComplete()))) && (t.isWithinStartEndDuration(filteredTasks.get(index)))) {
            return index + 1;
        }
        index++;
    } 
    return -1;
}