public void switchTurn() {
    turn = ((turn) + 1) % (getNumberOfPlayers());
    if (getCurrentPlayer().isInJail()) {
        gui.setGetOutOfJailEnabled(true);
    }else {
        gui.setGetOutOfJailEnabled(false);
        gui.setBuyHouseEnabled(getCurrentPlayer().canBuyHouse());
        gui.setTradeEnabled(turn, true);
    }
    gui.enablePlayerTurn(turn);
}