private void filterLastOutputTaskList() {
    java.lang.System.out.println(commandType);
    java.lang.System.out.println(index);
    java.lang.System.out.println(taskObj.getStatus());
    if ((((commandType) == (INDEX_SEARCH_DISPLAY)) && ((index) == (-1))) && (taskObj.getStatus().equals(logic.STATUS_COMPLETED))) {
        java.lang.System.out.println("Not filtering");
        return ;
    }else {
        java.lang.System.out.println("filtering");
        filterOutCompletedTasks();
    }
}