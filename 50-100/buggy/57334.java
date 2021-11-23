public Piece lowerPiece(Piece piece) {
    if (piece.checkPieceAtDropLoc()) {
        int diff = dropPiece(piece);
        BoardCoord[] coordinates = new BoardCoord[piece.getCoords().length];
        for (int i = 0; i < (coordinates.length); i++) {
            coordinates[i] = new BoardCoord(0, 0);
        }
        return new Piece(coordinates, diff);
    }else {
        piece.moveDown(board);
        return piece;
    }
}