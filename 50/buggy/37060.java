public void startGame() {
    gameStarted = true;
    diceRoll = -1;
    isDiceRolled = false;
    currentPlayerID = 0;
    prepareNextPlayer();
    java.lang.System.out.println("GAME STARTED");
    turn();
}