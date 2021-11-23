@javafx.fxml.FXML
void startModelCheck(javafx.event.ActionEvent event) {
    if (!(currentTrace.exists())) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("Specification file missing");
        alert.setHeaderText("No specification file loaded. Cannot run model checker.");
        alert.getDialogPane().getStylesheets().add("prob.css");
        alert.showAndWait();
        return ;
    }
    modelcheckController.startModelchecking(getOptions(), currentTrace.getStateSpace());
}