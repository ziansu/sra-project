private boolean setCurrentPlayerByIndex(int index) {
    if (!(playerIsAlive(players[index]))) {
        return false;
    }
    this.currentPlayerIndex = index;
    this.currentPlayer = players[this.currentPlayerIndex];
    this.gamePanel.setPlayerStatus(currentPlayer.getColor(), ((currentPlayer.getDisplayName()) + "'s Turn"));
    return true;
}