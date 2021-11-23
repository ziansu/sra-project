public void waitForNextPlayerAction() {
    if (!(initialized))
        return ;
    
    if (currentStage().isOver())
        nextStage();
    
    if ((currentStage()) == null) {
        showdown();
        notifyObservers();
        return ;
    }
    nextPlayer();
    notifyObservers();
    currentPlayer().play();
}