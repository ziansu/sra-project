private void markTask(main.logic.Logic.ListType type, java.util.ArrayList<java.lang.Integer> indexes, boolean status) {
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