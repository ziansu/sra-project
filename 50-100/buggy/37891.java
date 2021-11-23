@java.lang.Override
public void restartGame() {
    setIsOverState(false);
    clockTimer.setDelay(PokerRules.TexasHoldem.DELAY);
    dealer.collectCards();
    clearLastBets();
    dealer.startNewGame();
    setStartingStates();
    setCurrentPlayer(getPlayer());
    deactivateDealer();
    dealer.dealOutNHiddenCards(2);
}