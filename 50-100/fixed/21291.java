public boolean link(int projectHeadId, int taskUnderId) {
    if ((projectHeadId >= (mainLogic.TaskManager.displayedTasks.size())) || (taskUnderId >= (mainLogic.TaskManager.displayedTasks.size()))) {
        return false;
    }else
        if (projectHeadId == taskUnderId) {
            return false;
        }else {
            return link(mainLogic.TaskManager.displayedTasks.get(projectHeadId), mainLogic.TaskManager.displayedTasks.get(taskUnderId));
        }
    
}