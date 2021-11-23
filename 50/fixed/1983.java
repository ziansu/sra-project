@javafx.fxml.FXML
public void onCancel(javafx.event.ActionEvent event) {
    javafx.application.Platform.runLater(() -> {
        javafx.stage.Stage stage = ((javafx.stage.Stage) (cancelButton.getScene().getWindow()));
        stage.close();
    });
}