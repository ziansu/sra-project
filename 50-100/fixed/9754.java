public void tryPossibleMovementUpPositions(com.mygdx.game.gameplay.models.Position... positions) {
    java.util.HashSet<com.mygdx.game.gameplay.models.Position> positionsToCheck = new java.util.HashSet<com.mygdx.game.gameplay.models.Position>();
    for (com.mygdx.game.gameplay.models.Position position : positions) {
        position = position.moveAlongY(1);
        addToCheck(position, positionsToCheck);
        addToCheck(position.moveAlongX(1), positionsToCheck);
        addToCheck(position.moveAlongX((-1)), positionsToCheck);
    }
    for (com.mygdx.game.gameplay.models.Position position : positionsToCheck) {
        gravity.tryMoveFromPosition(position, false);
    }
}