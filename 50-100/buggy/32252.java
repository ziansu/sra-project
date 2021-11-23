@java.lang.Override
public void handle(final javafx.event.ActionEvent e) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    javafx.stage.FileChooser.ExtensionFilter filter = new javafx.stage.FileChooser.ExtensionFilter("*driver.exe (*.exe)", "*.exe");
    fileChooser.getExtensionFilters().add(filter);
    java.io.File filePath = fileChooser.showOpenDialog(arg0);
    browserPath.setText(filePath.getAbsolutePath());
}