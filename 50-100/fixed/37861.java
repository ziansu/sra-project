public MarioAI.graph.Collision lowerOppositeCornerCollision(float y, int currentXPosition, MarioAI.graph.JumpDirection direction) {
    currentXPosition += direction.getOppositeDirection().getHorizontalDirectionAsInt();
    if (isHittingWallOrGroundDownwards(currentXPosition, y)) {
        if (canMarioStandThere(currentXPosition, (y + 0.01F))) {
            return MarioAI.graph.Collision.HIT_GROUND;
        }else {
            throw new java.lang.Error("Logic error on corner collision detection");
        }
    }else {
        return MarioAI.graph.Collision.HIT_NOTHING;
    }
}