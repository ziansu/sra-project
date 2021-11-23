public java.lang.Boolean showRetryFileCreationPrompt(java.lang.String reason) {
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION);
    alert.setTitle("Program Notification");
    alert.setHeaderText(("File could not be created for the following reason: " + reason));
    alert.setContentText("Do you want to retry creating a session file?");
    java.util.Optional<javafx.scene.control.ButtonType> retryFileCreationAnswer = alert.showAndWait();
    return (retryFileCreationAnswer.get()) == (javafx.scene.control.ButtonType.OK);
}