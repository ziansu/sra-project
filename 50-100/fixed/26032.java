private void markTask(java.util.ArrayList<java.lang.Integer> indexes, boolean status, main.logic.Logic.ListType type) {
    switch (type) {
        case ALL :
            markTasksFromList(allTasks, indexes, status);
            break;
        case COMPLETED :
            markTasksFromList(completedTasks, indexes, status);
            break;
        default :
            break;
    }
}