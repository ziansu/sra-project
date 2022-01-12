public boolean acceptTrade(int playerIndex, boolean willAccept, int gameID) {
    shared.gameModel.GameModel serverModel = gamesList.get(gameID);
    if ((serverModel.getTradeOffer()) != null) {
        new server.facade.AcceptTradeCommand(playerIndex, willAccept, serverModel).execute();
        serverModel.incrementVersion();
        if (willAccept) {
            return true;
        }
    }
    return false;
}