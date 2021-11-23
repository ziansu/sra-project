private boolean isWithinView(int xPosition) {
    return (xPosition < (MarioAI.graph.edges.EdgeCreator.GRID_WIDTH)) && (xPosition >= 1);
}