private void formatEmptyList() {
    data = javafx.collections.FXCollections.observableArrayList(formattedList);
    listView = new javafx.scene.control.ListView<org.jimple.planner.task.Task>(data);
}