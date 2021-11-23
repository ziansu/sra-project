public int getNextPlayer() {
    while (playerList[currentPlayerIndex].HasToWait()) {
        playerList[currentPlayerIndex].WaitAsPenalty();
        currentPlayerIndex = ((currentPlayerIndex) + 1) % (playerList.length);
    } 
    return currentPlayerIndex;
}