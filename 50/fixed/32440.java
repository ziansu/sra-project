private void handleTaskListScrolling() {
    javafx.scene.control.ListView<main.model.task.ReadOnlyTask> scrollList = taskListPanel.getTaskListView();
    handlePageUp(scrollList);
    handlePageDown(scrollList);
}