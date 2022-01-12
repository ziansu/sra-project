private boolean setCurrentPlayerByIndex(int index) {
    this.currentPlayerIndex = index;
    if (!(playerIsAlive(players[index]))) {
        return false;
    }
    this.currentPlayer = players[this.currentPlayerIndex];
    this.gamePanel.setPlayerStatus(currentPlayer.getColor(), ((currentPlayer.getDisplayName()) + "'s Turn"));
    return true;
}