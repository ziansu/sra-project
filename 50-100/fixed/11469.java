@javafx.fxml.FXML
private void homeScreen(javafx.event.ActionEvent event) {
    javafx.scene.control.Alert confirm = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION, "Are you sure you want to disconnect ? You won't be able to rejoin the game.", javafx.scene.control.ButtonType.YES, javafx.scene.control.ButtonType.NO);
    confirm.setHeaderText("Disconnect");
    java.util.Optional<javafx.scene.control.ButtonType> result = confirm.showAndWait();
    if ((result.isPresent()) && (result.get().equals(javafx.scene.control.ButtonType.YES))) {
        if (client.isHostClient()) {
            client.disconnect();
            tdb.TheDrawingBoard.disconnectMultiplayerServer();
        }else {
            client.disconnect();
        }
    }
}