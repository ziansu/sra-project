private boolean determineIfThisNodeIsUseable(MarioAI.World world) {
    if ((moveInfo.getXPositions().length) == 0) {
        return false;
    }
    if (!(MarioAI.marioMovement.MarioControls.canMarioUseEdge(ancestorEdge, parentXPos, parentVx, moveInfo.getTotalTicksJumped(), moveInfo.getXMovementDistance(), moveInfo.getXPositions()))) {
        return false;
    }
    if (getMoveInfo().hasCollisions(parent, world)) {
        return false;
    }
    return true;
}