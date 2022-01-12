@javafx.fxml.FXML
private void startModelCheck() {
    if (currentTrace.exists()) {
        startModelchecking(getOptions(), animations.getCurrentTrace().getStateSpace());
    }else {
        stageManager.makeAlert(javafx.scene.control.Alert.AlertType.ERROR, "No specification file loaded. Cannot run model checker.").showAndWait();
        this.hide();
    }
}