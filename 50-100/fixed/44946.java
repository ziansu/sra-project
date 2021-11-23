public void openFileExplorer() {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    java.io.File selectedFile;
    selectedFile = fileChooser.showOpenDialog(new javafx.stage.Stage());
    if (selectedFile != null) {
        pathImage.setText(selectedFile.getPath());
        fImage.setImage((foto = new javafx.scene.image.Image(("file:" + (pathImage.getText())))));
    }
}