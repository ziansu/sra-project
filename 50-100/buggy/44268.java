@java.lang.Override
public void handle(final javafx.event.ActionEvent e) {
    final javafx.stage.DirectoryChooser directoryChooser = new javafx.stage.DirectoryChooser();
    final java.io.File selectedDirectory = directoryChooser.showDialog(currentStage);
    if (selectedDirectory != null) {
        selectedDirectory.getAbsolutePath();
    }
    sortDir = selectedDirectory;
    jsort = new JSorter(sortDir.getAbsolutePath().toString());
    chooseFile.setText(sortDir.getAbsolutePath().toString());
}