public boolean canMove() {
    if (!(currentPlayer.isStillIn())) {
        return false;
    }
    if ((diceRoll) == 0) {
        return false;
    }
    if (!(noWinner)) {
        return false;
    }
    if ((board.currentRoom(currentPlayer)) != null) {
        return false;
    }
    return true;
}