@java.lang.Override
public void onSuccess(com.bobvash.resolutiontracker.client.TaskListClientView result) {
    while ((tasksHolderPanel.getWidgetCount()) > 0)
        tasksHolderPanel.remove(tasksHolderPanel.getWidget(0));
    
    loadedTaskList.clear();
    loadedTaskList.add(result);
    for (final com.bobvash.resolutiontracker.client.TaskListClientView taskList : loadedTaskList)
        for (final com.bobvash.resolutiontracker.client.SingleTaskClientView task : taskList.getTasks()) {
            createNewTaskWidget(taskList, task);
        }
    
}