private void playGame(spil.Player firstPlayer, spil.Player lastPlayer) {
    while (true) {
        playTurn(firstPlayer);
        if ((firstPlayer.hasWon(true)) || (firstPlayer.hasLost(true)))
            break;
        
        playTurn(lastPlayer);
        if ((lastPlayer.hasWon(true)) || (lastPlayer.hasLost(true)))
            break;
        
        fieldController.resetPlayers(firstPlayer, lastPlayer);
    } 
}