public MarioAI.graph.Collision upperOppositeCornerCollision(float y, int currentXPosition, MarioAI.graph.JumpDirection direction) {
    if (!(direction.isLeftType())) {
        currentXPosition += direction.getOppositeDirection().getHorizontalDirectionAsInt();
    }
    if (isHittingWallOrGroundUpwards(currentXPosition, (y - (MarioAI.graph.edges.EdgeCreator.MARIO_HEIGHT)))) {
        return MarioAI.graph.Collision.HIT_CEILING;
    }else {
        return MarioAI.graph.Collision.HIT_NOTHING;
    }
}