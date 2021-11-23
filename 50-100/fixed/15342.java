public java.lang.Integer removeTask(application.Command cmd) {
    searchList.clear();
    searchTasksForMatches(cmd);
    switch (searchList.size()) {
        case 0 :
            return application.DataManager.TASK_NOT_FOUND;
        case 1 :
            taskList.remove(searchList.get(0));
            file.clear();
            file.saveToFile(tasksToStrings());
            return application.DataManager.TASK_REMOVED;
        default :
            application.LogicController.getInstance().chooseLine(tasksToStrings(searchList));
            return application.DataManager.MULTIPLE_MATCHES;
    }
}