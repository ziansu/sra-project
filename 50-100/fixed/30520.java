public java.util.Set<stilkin.GoCoord> getLibertiesOfString(final java.util.Collection<stilkin.GoCoord> stringSet) {
    final java.util.Set<stilkin.GoCoord> liberties = new java.util.HashSet<stilkin.GoCoord>();
    for (stilkin.GoCoord piece : stringSet) {
        liberties.addAll(getAdjacendCoords(piece.x, piece.y, 0));
    }
    return liberties;
}