private void handleDisplayList(final javafx.scene.control.TextField txtF, final javafx.scene.control.ListView listView, java.util.List<entity.Task> taskList) {
    if (taskList.isEmpty()) {
        listView.getItems().clear();
        listView.setOpacity(0);
        txtF.setText(Message.UI_NO_TASK_FOUND);
        txtF.selectAll();
    }else {
        application.Main.addTaskToListView(listView, successObj);
        application.Main.switchListView(listView);
    }
}