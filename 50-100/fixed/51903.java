private void obtainTaskId() {
    int index = commandObj.getIndex();
    if ((index > 0) && (index <= (lastOutputTaskList.size()))) {
        index--;
        taskIdToDelete = lastOutputTaskList.get(index).getTaskId();
    }
}