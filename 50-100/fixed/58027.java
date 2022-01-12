private java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> getEasiestPiece() {
    java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> easiestPiece = null;
    for (java.util.Map.Entry<puzzlesolver.Coord, puzzlesolver.solver.GreedySolver.ScoredPiece> entry : madePieceCache.entrySet()) {
        if ((easiestPiece == null) || ((entry.getValue().score) < (easiestPiece.getValue().score))) {
            easiestPiece = entry;
        }
    }
    return easiestPiece;
}