private void chooseBeginner() throws java.io.IOException {
    currentPlayer = player2;
    dice = rollDice(2);
    currentPlayer.setPossibleHops(dice);
    snapshot = undoSnapshot = new BoardSnapshot(this);
    undoPlayer = currentPlayer;
}