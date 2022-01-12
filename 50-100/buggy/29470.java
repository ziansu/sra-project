public void newBoard() {
    resetNumbers();
    bombPos = new java.util.HashSet<>();
    positionFilled = new java.util.HashSet<>();
    revealedArea = new java.util.HashSet<>();
    for (int i = 0; i < (y); i++) {
        for (int j = 0; j < (x); j++) {
            board[j][i] = 20;
        }
    }
}