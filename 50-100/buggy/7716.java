private void shiftCurrentPlayer() {
    currentPlayerPosition = ((currentPlayerPosition) + 1) % (activePlayers.size());
    currentPlayer = activePlayers.get(currentPlayerPosition);
    notifyCurrentPlayerUpdated(currentPlayer);
    java.lang.System.out.println(("[TEST] Current Player: " + (currentPlayer.toString())));
}