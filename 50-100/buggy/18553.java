private void updatePrincipalContinuation(int currPly, boolean isTerminalNode, com.fluxchess.jcpi.models.GenericMove currMove) {
    pc[currPly][currPly] = currMove;
    if (!isTerminalNode) {
        for (int nextPly = currPly + 1; nextPly < (eubos.board.MiniMaxMoveGenerator.SEARCH_DEPTH_IN_PLY); nextPly++) {
            pc[currPly][nextPly] = pc[nextPly][nextPly];
        }
    }
}