private boolean isHittingWallOrGroundUpwards(int xPosition, float yPosition) {
    if (!(isWithinView(xPosition))) {
        throw new java.lang.Error("Logic error: this should never be checked out of the level matrix");
    }
    return (isOnLevelMatrix(xPosition, ((int) (yPosition - 0.01)))) && (MarioAI.graph.edges.EdgeCreator.isSolid(observationGraph[xPosition][((int) (yPosition - 0.01))]));
}