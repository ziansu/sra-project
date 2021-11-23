private void filterLastOutputTaskList() {
    if ((((commandType) == (INDEX_SEARCH_DISPLAY)) && ((index) == (-1))) && (taskObj.getStatus().equals(logic.STATUS_COMPLETED))) {
        return ;
    }else {
        filterOutCompletedTasks();
    }
}