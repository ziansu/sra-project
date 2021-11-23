public void incomingMove(int x, int y) {
    android.util.Log.d(LOG_TAG, "incomingMove");
    if (!(isGameOver())) {
        if (p2.isMyTurn(turn)) {
            if (isValidMove(x, y)) {
                p2.setMove(x, y);
                drawMove(p2.getMove()[0], p2.getMove()[1], p2);
                android.util.Log.d(LOG_TAG, "Move drawn");
            }else {
            }
        }
    }
}