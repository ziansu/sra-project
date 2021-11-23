@javafx.fxml.FXML
void handleImport(javafx.event.ActionEvent event) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.getExtensionFilters().add(new javafx.stage.FileChooser.ExtensionFilter("Data Files", "*.txt", "*.dat"));
    fileChooser.setInitialDirectory(new java.io.File("./data"));
    java.io.File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());
    mainApp.getMainLayoutController().getLineChartController().importDataFromFile(file.toPath());
}