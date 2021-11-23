void pieceDropped() {
    java.lang.System.out.println("piece dropped");
    for (int[] coord : curPiece.getCoords()) {
        int x = (coord[0]) + (curX);
        int y = (coord[1]) + (curY);
        dropped[x][y] = curPiece.tetrominoes;
    }
    removeFullLines();
    hasDropped = true;
}