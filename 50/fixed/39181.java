private void deleteTask(java.util.ArrayList<java.lang.Integer> indexes, main.logic.Logic.ListType type) {
    switch (type) {
        case ALL :
            deleteTasksFromList(allTasks, indexes);
            break;
        case COMPLETED :
            deleteTasksFromList(completedTasks, indexes);
            break;
        default :
            break;
    }
}