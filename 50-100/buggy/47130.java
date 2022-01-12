private int numberOfPiecesBlocked(int player) {
    int emptyBoard = (this.board[it.unibo.ai.didattica.mulino.implementation.BitboardMinimax.PLAYER_W]) | (this.board[it.unibo.ai.didattica.mulino.implementation.BitboardMinimax.PLAYER_B]);
    int totBlocked = 0;
    for (int i = 0; i < 24; i++) {
        if (this.pieceIsBlocked(emptyBoard, i)) {
            totBlocked++;
        }
    }
    return totBlocked;
}