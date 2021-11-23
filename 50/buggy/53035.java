@javafx.fxml.FXML
private void exit(javafx.event.ActionEvent e) {
    e.consume();
    javafx.application.Platform.exit();
    java.lang.System.exit(0);
}