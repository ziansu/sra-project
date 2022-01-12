private boolean isHittingWallOrGroundUpwards(int xPosition, float yPosition) {
    return (isOnLevelMatrix(xPosition, ((int) (yPosition - 0.01)))) && (MarioAI.graph.edges.EdgeCreator.isSolid(observationGraph[xPosition][((int) (yPosition - 0.01))]));
}