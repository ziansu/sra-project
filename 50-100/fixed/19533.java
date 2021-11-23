private void setMazeColor(int deltaR, int deltaC) {
    if (deltaR != 0)
        mazeLabels[((playerLocR) + ((-1) * deltaR))][playerLocC].setBackground(visitedColor);
    
    if (deltaC != 0)
        mazeLabels[playerLocR][((playerLocC) + ((-1) * deltaC))].setBackground(visitedColor);
    
}