@java.lang.Override
public dameo.move.Move searchBestMove(dameo.gametree.State s) {
    dameo.move.Move m = alphaBeta(s, searchDepth, alpha, beta, 1).getMove();
    return m;
}