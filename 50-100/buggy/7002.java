public void playGame() {
    boolean gameIsActive = true;
    boolean humanTurn = false;
    while (gameIsActive) {
        for (int indexPlayer = 0; indexPlayer < (players.length); indexPlayer++) {
            if (indexPlayer == (humanPlayerId)) {
                java.lang.System.out.println("THIS IS A HUMAN");
                showPlayerTurn();
            }else {
                java.lang.System.out.println("This is a bot");
                showBotTurn();
            }
        }
        gameIsActive = false;
    } 
}