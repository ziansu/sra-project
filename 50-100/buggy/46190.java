public void run() {
    while (true) {
        beginTurn();
        if ((getWinner()) == null) {
            while (activePlayer.canPlayCards()) {
                activePlayer.playCard(opponentPlayer);
            } 
            endTurn();
        }else {
            de.kimminich.kata.tcg.Game.logger.info(((getWinner()) + " wins the game!"));
            break;
        }
    } 
}