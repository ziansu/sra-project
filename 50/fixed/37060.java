public void startGame() {
    java.lang.System.out.println("GAME STARTED");
    gameStarted = true;
    diceRoll = -1;
    isDiceRolled = false;
    currentPlayerID = 0;
    prepareNextPlayer();
    turn();
}