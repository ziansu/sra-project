public synchronized void spectate(poker.HeadsUpHand hand, poker.HeadsUpPokerGame game, int streetIn, java.lang.String message) {
    hand.printBoard(streetIn, game.handNumber, this);
    addMessage(message);
    send();
    clearMessages();
}