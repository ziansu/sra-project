@javafx.fxml.FXML
java.lang.String getIPAddress() {
    java.lang.String ipAddress = "";
    javafx.scene.control.TextInputDialog dialog = new javafx.scene.control.TextInputDialog();
    dialog.setTitle("Share an Audio");
    dialog.setContentText("IP Address:");
    dialog.setHeaderText("Enter the required IP Address below");
    java.util.Optional<java.lang.String> result = dialog.showAndWait();
    if (result.isPresent()) {
        ipAddress = result.get();
    }
    return ipAddress;
}