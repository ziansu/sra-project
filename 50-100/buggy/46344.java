public double getReward(TetrisBoard board, TetrisPiece current_piece) {
    double reward = 0.0;
    for (int r = 0; r < (board.height); r++) {
        if ((board.checkEliminate(r)) == true) {
            reward += 0.25;
        }
    }
    if ((reward == 0) && ((NNBot.getLegalMoves(board, current_piece).size()) == 0)) {
        return -1;
    }
}