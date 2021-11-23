private void handleTaskListScrolling() {
    javafx.scene.control.ListView<main.model.task.ReadOnlyTask> scrollList = taskListPanel.getTaskListView();
    int max = main.ui.TaskListPanel.getCurrentTaskListSize();
    handlePageUp(scrollList, max);
    handlePageDown(scrollList, max);
}