public void switchTurn() {
    turn = ((turn) + 1) % (getNumberOfPlayers());
    if (!(getCurrentPlayer().isInJail())) {
        gui.enablePlayerTurn(turn);
        gui.setBuyHouseEnabled(getCurrentPlayer().canBuyHouse());
        gui.setTradeEnabled(turn, true);
    }else {
        gui.setGetOutOfJailEnabled(false);
    }
}