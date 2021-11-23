public void incomingMove(int x, int y) {
    if (!(isGameOver())) {
        if (p2.isMyTurn(turn)) {
            if (isValidMove(x, y)) {
                p2.setMove(x, y);
                drawMove(p2.getMove()[0], p2.getMove()[1], p2);
            }
        }
    }
}