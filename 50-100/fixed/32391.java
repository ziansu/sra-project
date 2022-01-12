private void runMainLoop() {
    int numGuessesLeft = assignment2.Utilities.GameConfiguration.numGuesses;
    java.lang.String response;
    while (numGuessesLeft > 0) {
        showGuessInfo(numGuessesLeft);
        response = player1.respond();
        if (response.equals("HISTORY")) {
            showBoard();
            continue;
        }else {
            recordGuess(response);
            if (codeBreakerWon) {
                return ;
            }
        }
        numGuessesLeft -= 1;
    } 
    codeMakerWon = true;
}