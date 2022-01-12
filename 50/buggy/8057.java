public void startBattle() {
    player.startBattle(playerAmalgamation, opponentAmalgamation);
    opponent.startBattle(opponentAmalgamation, playerAmalgamation);
    doTurn();
}