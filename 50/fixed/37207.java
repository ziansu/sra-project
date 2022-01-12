@java.lang.Override
public java.lang.String computeNextMove(java.lang.String options, java.util.List<java.lang.String> pgnMoves) throws org.alcibiade.chess.model.IllegalMoveException, org.alcibiade.chess.model.PgnMoveException {
    int depth = java.lang.Integer.parseInt(options);
    return phalanxEngine.computeNextMove(depth, 0, pgnMoves);
}