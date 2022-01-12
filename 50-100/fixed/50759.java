@javafx.fxml.FXML
private void initialize() throws java.io.IOException {
    getSystemProcesses();
    nameColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("name"));
    pidColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("pid"));
    usedMemoryColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("usedMemory"));
    tableTasks.setItems(javafx.collections.FXCollections.observableArrayList(name.javalex.controllers.MainController.PROCESSES));
}