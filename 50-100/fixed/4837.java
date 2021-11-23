public boolean isFinished(Player currentPlayer) {
    if (hasPlayerWon(currentPlayer)) {
        winMessage = (currentPlayer.getName()) + " wins!";
        return true;
    }
    if (isFilled()) {
        winMessage = "Nobody wins!";
        return true;
    }
    return false;
}