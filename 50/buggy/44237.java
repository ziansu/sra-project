public static void incompleteForm() {
    javafx.scene.control.Alert alert = graphicalInterface.Alerts.createAlert(javafx.scene.control.Alert.AlertType.ERROR, "Please enter a source file and an offset time.");
    alert.setTitle("Incomplete form");
    alert.setHeaderText(null);
    alert.showAndWait();
}