public void setTaskContainer(com.illinois.rts.visualizer.TaskContainer inTaskContainer) {
    if ((inTaskContainer.size()) == 0)
        return ;
    
    this.removeAll();
    taskConfigPanels.clear();
    taskContainer = inTaskContainer;
    java.util.ArrayList<com.illinois.rts.framework.Task> appTasks = taskContainer.getAppTasksAsArray();
    for (com.illinois.rts.framework.Task thisTask : appTasks) {
        addOneRow(thisTask);
    }
}