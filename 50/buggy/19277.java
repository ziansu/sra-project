public int[] backtrack() {
    for (int i = 0; i < 10; i++) {
        for (int move : moves) {
            minimax(move);
        }
    }
    return moves;
}