public void nextPhase() {
    if ((currentPlayer.getPhase()) == 3) {
        currentPlayer.nextPhase();
        nextPlayer();
    }else {
        currentPlayer.nextPhase();
    }
}