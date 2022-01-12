public MarioAI.graph.edges.edgeCreation.Collision lowerOppositeCornerCollision(float y, int currentXPosition, MarioAI.graph.edges.edgeCreation.JumpDirection direction) {
    currentXPosition += direction.getOppositeDirection().getHorizontalDirectionAsInt();
    if (isHittingWallOrGroundDownwards(currentXPosition, y)) {
        if (canMarioStandThere(currentXPosition, (y + 0.01F))) {
            return Collision.HIT_GROUND;
        }else {
            throw new java.lang.Error("Logic error on corner collision detection");
        }
    }else {
        return Collision.HIT_NOTHING;
    }
}