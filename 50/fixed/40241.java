@javafx.fxml.FXML
public void onFleetSetupButtonClicked() {
    game.placePlayersShips();
    sendToServerButton.setVisible(true);
}