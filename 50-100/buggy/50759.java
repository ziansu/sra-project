@javafx.fxml.FXML
private void initialize() throws java.io.IOException {
    getSystemProcesses();
    nameColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("name"));
    pidColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("pid"));
    usedMemoryColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("usedMemory"));
    java.lang.System.out.println(javafx.collections.FXCollections.observableArrayList(name.javalex.controllers.MainController.PROCESSES));
    tableTasks.setItems(javafx.collections.FXCollections.observableArrayList(name.javalex.controllers.MainController.PROCESSES));
}