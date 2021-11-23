public boolean isFinished(Player currentPlayer) {
    if (isFilled()) {
        winMessage = "Nobody wins!";
        return true;
    }
    if (hasPlayerWon(currentPlayer)) {
        winMessage = (currentPlayer.getName()) + " wins!";
        return true;
    }
    return false;
}