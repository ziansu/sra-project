public void handleClickedBrowseButton(javafx.event.ActionEvent actionEvent) {
    java.util.List<java.io.File> files = fileChooser.showOpenMultipleDialog(pane.getScene().getWindow());
    java.util.List<java.lang.String> filePaths = files.stream().filter(java.io.File::exists).map(java.io.File::getAbsolutePath).collect(java.util.stream.Collectors.toList());
    networkTextField.setText(java.lang.String.join(" ; ", filePaths));
}