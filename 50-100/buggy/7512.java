public org.apollo.game.model.Position fromDeltas(int deltaX, int deltaY, int deltaZ) {
    return new org.apollo.game.model.Position(((getX()) + deltaX), ((getY()) + deltaY), ((getHeight()) + deltaZ));
}