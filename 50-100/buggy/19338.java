@java.lang.Override
public void execute() {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    java.lang.String path = getClass().getResource("/files").getPath();
    fileChooser.setTitle("Open Resource File");
    fileChooser.getExtensionFilters().add(new javafx.stage.FileChooser.ExtensionFilter("Text Files", "*.txt"));
    java.io.File selectedFile = fileChooser.showOpenDialog(stage);
    if (selectedFile != null) {
        commands.Command command = new commands.io.ReloadCommand(stage, selectedFile, infoBox);
        command.execute();
    }
}