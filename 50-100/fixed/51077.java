@java.lang.Override
public void execute() {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Save File As");
    fileChooser.getExtensionFilters().add(new javafx.stage.FileChooser.ExtensionFilter("Text Files", "*.txt"));
    java.io.File selectedFile = fileChooser.showSaveDialog(stage);
    if (selectedFile != null) {
        sudoku.setFile(selectedFile);
        commands.Command command = new commands.io.SaveCommand(sudoku, infoBox);
        command.execute();
    }
}