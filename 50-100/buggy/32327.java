@java.lang.Override
public void handle(final javafx.event.ActionEvent e) {
    final javafx.stage.DirectoryChooser directoryChooser = new javafx.stage.DirectoryChooser();
    final java.io.File selectedDirectory = directoryChooser.showDialog(window);
    if (selectedDirectory != null) {
        selectedDirectory.getAbsolutePath();
        Path_TextField.setPromptText(selectedDirectory.getAbsolutePath());
    }
}