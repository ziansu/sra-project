@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    javafx.stage.DirectoryChooser directoryChooser = new javafx.stage.DirectoryChooser();
    java.io.File selectedDirectory = directoryChooser.showDialog(stage);
    if (selectedDirectory == null) {
        path = null;
    }else {
        path.setText(selectedDirectory.getAbsolutePath());
    }
}