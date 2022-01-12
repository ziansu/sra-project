@javafx.fxml.FXML
void save(javafx.event.ActionEvent actionEvent) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Save Image");
    fileChooser.getExtensionFilters().addAll(new javafx.stage.FileChooser.ExtensionFilter("All Images", "*.*"), new javafx.stage.FileChooser.ExtensionFilter("SER", "*.ser"));
    java.io.File file = fileChooser.showSaveDialog(Main.primaryStage);
    if (file != null) {
        SaveFile(Main.commands, file);
    }
}