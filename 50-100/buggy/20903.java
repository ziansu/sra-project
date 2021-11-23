public void waitForNextPlayerAction() {
    if (!(initialized))
        return ;
    
    if (currentStage().isOver())
        nextStage();
    
    if ((currentStage()) == null) {
        showdown();
        return ;
    }
    nextPlayer();
    notifyObservers();
    currentPlayer().play();
}