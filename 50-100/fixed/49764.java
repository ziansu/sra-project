public boolean moveInBounds(chessProject.Move move) {
    int finalX = (x) + (move.delX);
    int finalY = (y) + (move.delY);
    java.lang.System.out.println(((finalX + "\t") + finalY));
    return !((((finalX > 7) || (finalX < 0)) || (finalY < 0)) || (finalY > 7));
}