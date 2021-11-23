public void MedienBrowser(javafx.event.ActionEvent event) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Open Media File");
    java.io.File file = fileChooser.showOpenDialog(this.getScene().getWindow());
    tbxMedienBrowser.setUserData(file);
    tbxMedienBrowser.setText(file.getAbsolutePath());
}