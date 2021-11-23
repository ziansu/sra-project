@javafx.fxml.FXML
public void onFleetSetupButtonClicked() {
    this.game.placePlayersShips();
    this.sendToServerButton.setVisible(true);
}