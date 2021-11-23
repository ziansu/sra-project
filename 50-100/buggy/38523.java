@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof poseidon.entities.Piece)) {
        return false;
    }
    poseidon.entities.Piece otherPiece = ((poseidon.entities.Piece) (o));
    java.util.Set<poseidon.entities.Point> myPoints = new java.util.HashSet(java.util.Arrays.asList(this.piece));
    java.util.Set<poseidon.entities.Point> otherPoints = new java.util.HashSet(java.util.Arrays.asList(otherPiece.getPiece()));
    return myPoints.equals(otherPoints);
}