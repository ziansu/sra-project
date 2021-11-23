private void moveCompleted(final boolean resetAutoplayLaneIndexLocked) {
    (moveCount)++;
    activity.updateMoveCount();
    if ((moveCount) == 1) {
        gameQueryHandler.startInsert(0, null, GameContract.Games.CONTENT_URI, null);
        resumeGame();
    }
    if (resetAutoplayLaneIndexLocked)
        for (int laneIndex = 0; laneIndex < 13; laneIndex++)
            autoplayLaneIndexLocked[laneIndex] = false;
        
    
    checkForWin();
    if ((pendingMoves) == 0)
        autoPlay();
    
}