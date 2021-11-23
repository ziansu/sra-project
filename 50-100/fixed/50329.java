@java.lang.Override
public java.util.Set<jchess.core.Square> getSquaresInRange() {
    java.util.Set<jchess.core.Square> list = new java.util.HashSet<>();
    list.addAll(getMovesForDirection(jchess.core.pieces.traits.behaviors.implementation.DIRECTION_LEFT, jchess.core.pieces.traits.behaviors.implementation.DIRECTION_UP));
    list.addAll(getMovesForDirection(jchess.core.pieces.traits.behaviors.implementation.DIRECTION_LEFT, jchess.core.pieces.traits.behaviors.implementation.DIRECTION_BOTTOM));
    list.addAll(getMovesForDirection(jchess.core.pieces.traits.behaviors.implementation.DIRECTION_RIGHT, jchess.core.pieces.traits.behaviors.implementation.DIRECTION_UP));
    list.addAll(getMovesForDirection(jchess.core.pieces.traits.behaviors.implementation.DIRECTION_RIGHT, jchess.core.pieces.traits.behaviors.implementation.DIRECTION_BOTTOM));
    return list;
}