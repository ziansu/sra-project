@java.lang.Override
public void restartGame() {
    setIsOverState(false);
    clockTimer.setDelay(PokerRules.TexasHoldem.DELAY);
    dealer.collectCards();
    clearLastBets();
    dealer.startNewGame();
    deactivateDealer();
    setStartingStates();
    setCurrentPlayer(getPlayer());
    dealer.dealOutNHiddenCards(2);
}