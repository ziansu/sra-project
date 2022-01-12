@javafx.fxml.FXML
void onSendToServerButtonClicked() {
    fleetSetupButton.setDisable(true);
    game.buildOpponentsBoard(new com.spanish_inquisition.battleship.client.board.boardcontroller.OpponentBoardController(new com.spanish_inquisition.battleship.client.board.GameBoard(opponentsGridPane)));
    socketClient.sendStringToServer(game.getShipPlacementForServer());
}