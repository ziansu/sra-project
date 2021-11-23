public Piece lowerPiece(Piece piece) {
    BoardCoord[] coordinates = new BoardCoord[piece.getCoords().length];
    for (int i = 0; i < (coordinates.length); i++) {
        coordinates[i] = new BoardCoord(0, 0);
    }
    if (piece.checkPieceAtDropLoc()) {
        int type = -1;
        return new Piece(coordinates, type);
    }else {
        piece.moveDown(board);
        return piece;
    }
}