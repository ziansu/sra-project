private boolean rangeIsClear(net.torocraft.chess.engine.chess.ChessPieceState.Rank currentRank, int fromFile, int toFile) {
    if (fromFile > toFile) {
        int toFileBackup = toFile;
        toFile = fromFile;
        fromFile = toFileBackup;
    }
    for (int file = fromFile + 1; file <= (toFile - 1); file++) {
        net.torocraft.chess.engine.chess.ChessPieceState.Position position = new net.torocraft.chess.engine.chess.ChessPieceState.Position(net.torocraft.chess.engine.chess.ChessPieceState.File.values()[file], currentRank);
        if (!(isSpaceFreeFullCheck(position))) {
            return false;
        }
    }
    return true;
}