@javafx.fxml.FXML
private void handleOpen() {
    final javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Open File");
    fileChooser.getExtensionFilters().add(new javafx.stage.FileChooser.ExtensionFilter("Classical B Files", "*.mch", "*.ref", "*.imp"));
    final java.io.File selectedFile = fileChooser.showOpenDialog(this.window);
    if (selectedFile == null) {
        return ;
    }
    this.open(selectedFile.getAbsolutePath());
}