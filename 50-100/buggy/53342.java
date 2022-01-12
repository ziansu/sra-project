private void endGame() {
    if ((player1.score) > (player2.score)) {
        gameGUI.showWinner(player1.getName(), player1.score);
        player1.won = true;
    }else
        if ((player1.score) < (player2.score)) {
            gameGUI.showWinner(player2.getName(), player2.score);
            player2.won = true;
        }else {
            gameGUI.showWinner("Tie Game", player1.score);
        }
    
    updateStats();
}