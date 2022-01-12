@javafx.fxml.FXML
private void handleBack() {
    primStage = ((javafx.stage.Stage) (btnEdit.getScene().getWindow()));
    primStage.close();
}