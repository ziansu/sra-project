public void checkForWin() {
    if ((incorrectGuesses) >= 7)
        stanGry = Interfaces.GameStates.LOSE;
    else
        if ((correctAnswers.size()) == (word.length()))
            stanGry = Interfaces.GameStates.WIN;
        else
            stanGry = Interfaces.GameStates.IN_PROGRESS;
        
    
    notifyWisielecObservers();
}