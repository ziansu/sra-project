private boolean checkForBankruptcy(spil.entity.Player currentPlayer) {
    if (currentPlayer.isBankrupt()) {
        spil.boundary.GUIBoundary.print(spil.entity.TextInfo.removePlayerMessage(currentPlayer));
        spil.boundary.GUIBoundary.removePlayerCar(currentPlayer);
        gameBoard.deleteFieldOwners(currentPlayer);
        gameBoard.deletePlayerHouses(currentPlayer);
        playerList.removePlayer(currentPlayer);
        return true;
    }
    return false;
}