public java.util.List<stilkin.GoCoord> getLibertiesOfString(final java.util.Collection<stilkin.GoCoord> stringSet) {
    final java.util.List<stilkin.GoCoord> liberties = new java.util.ArrayList<stilkin.GoCoord>();
    for (stilkin.GoCoord piece : stringSet) {
        liberties.addAll(getAdjacendCoords(piece.x, piece.y, 0));
    }
    return liberties;
}