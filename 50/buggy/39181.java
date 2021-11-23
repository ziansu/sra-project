private void deleteTask(main.logic.Logic.ListType type, java.util.ArrayList<java.lang.Integer> indexes) {
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