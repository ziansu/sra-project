public void reset() {
    manager.reset();
    int swapRound = ((manager.getPotsFinished()) % 4) - 1;
    if (swapRound != 4)
        finishedSwapping = false;
    
    displayedHeartsBroken = false;
    animationsActive = new java.util.HashMap<android.view.View, java.lang.Integer>();
    initialOutputWritten = false;
    buttonsPresent = false;
    foundStartPlayer = false;
    currentPotTurn = 0;
    currentPlayerInteracting = 0;
    chosenLists.clear();
    chosenCards.clear();
}