private void movePlayer(int deltaR, int deltaC) {
    mazeLabels[playerLocR][playerLocC].setIcon(null);
    playerLocR += deltaR;
    playerLocC += deltaC;
    mazeLabels[playerLocR][playerLocC].setIcon(playerIcon);
    setMazeColor(deltaR, deltaC);
    handleGameOver();
}