@javafx.fxml.FXML
void testServerConnection() {
    if (debug)
        log.info(("Testing connection to server on address: " + (com.client.gui.interfaceControllers.LobbyController.serverAddress)));
    
    java.lang.String alertMessage;
    if ((com.client.gui.interfaceControllers.LobbyController.serverAddress) != null)
        return ;
    else {
        alertMessage = ("Address " + (com.client.gui.interfaceControllers.LobbyController.serverAddress)) + ",that you entered, is invalid! Please enter valid IPv4 address.";
        showAlert(javafx.scene.control.Alert.AlertType.ERROR, "", "Invalid IP address!", alertMessage);
    }
}