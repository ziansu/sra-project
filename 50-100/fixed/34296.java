public static void promptError(javafx.stage.Window owner, java.lang.String errorText) {
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
    if (owner != null) {
        alert.initOwner(owner);
        alert.initModality(javafx.stage.Modality.WINDOW_MODAL);
    }
    alert.setTitle("An error occurred!");
    alert.setHeaderText(errorText);
    alert.setContentText(null);
    alert.show();
}