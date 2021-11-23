private java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> getEasiestPiece() {
    java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> easiestPiece = null;
    float minScore = java.lang.Float.MAX_VALUE;
    for (java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> entry : madePieceCache.entrySet()) {
        final float score = entry.getValue().score;
        if (score < minScore) {
            easiestPiece = entry;
            minScore = score;
        }
    }
    return easiestPiece;
}