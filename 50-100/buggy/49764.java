public boolean moveInBounds(chessProject.Move move) {
    int finalX = (x) + (move.delX);
    int finalY = (y) + (move.delY);
    return !((((finalX > 7) || (finalX < 0)) || (finalY < 0)) || (finalY > 7));
}