private void obtainTaskId() {
    int index = commandObj.getIndex();
    if ((index > 0) && (index <= (taskList.size()))) {
        index--;
        taskIdToDelete = lastOutputTaskList.get(index).getTaskId();
    }
}