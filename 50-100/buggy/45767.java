public void setAt(pieces.Piece piece, java.lang.String coordinate) {
    int rankIdx = getRankIdx(coordinate);
    int fileIdx = getFileIdx(coordinate);
    java.util.ArrayList<pieces.Piece> rank = ranks.get(rankIdx);
    rank.set(fileIdx, piece);
    ranks.set(rankIdx, rank);
}