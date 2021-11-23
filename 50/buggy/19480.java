public int getNextPlayer() {
    if (playerList[currentPlayerIndex].HasToWait()) {
        playerList[currentPlayerIndex].WaitAsPenalty();
        currentPlayerIndex = ((currentPlayerIndex) + 1) % (playerList.length);
    }
    return currentPlayerIndex;
}