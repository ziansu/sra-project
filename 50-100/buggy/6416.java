private void playGame(spil.Player firstPlayer, spil.Player lastPlayer) {
    while (true) {
        playTurn(firstPlayer);
        if ((firstPlayer.hasWon()) || (firstPlayer.hasLost()))
            break;
        
        playTurn(lastPlayer);
        if ((lastPlayer.hasWon()) || (lastPlayer.hasLost()))
            break;
        
        fieldController.resetPlayers(firstPlayer, lastPlayer);
    } 
}