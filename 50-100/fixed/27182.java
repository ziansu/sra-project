@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.String item = myCustomListView.getSelectionModel().getSelectedItem();
    java.lang.System.out.println(("Right Click on: " + item));
    backend.Task taskToComplete = tdl.getTask(item);
    taskToComplete.setStatus(Task.COMPLETED);
    tdl.setTaskCompleted(taskToComplete);
    loadTaskNames();
}