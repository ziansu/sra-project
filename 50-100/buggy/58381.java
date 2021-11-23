private void initializeTurns() {
    client.model.ClientGameManager game = client.model.ClientGame.getGame();
    int myIndex = game.myPlayerIndex();
    shared.definitions.CatanColor myColor = game.getPlayerColorByIndex(myIndex);
    for (int i = 0; i < (game.getNumberPlayers()); i++) {
        getView().initializePlayer(i, game.getPlayerNameByIndex(i), game.getPlayerColorByIndex(i));
    }
    getView().setLocalPlayerColor(myColor);
}