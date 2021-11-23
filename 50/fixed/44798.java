public boolean isObstacleInDirection(languagelearning.agents.Direction direction) {
    int xAhead = getNewXInDirection(direction);
    int yAhead = getNewYInDirection(direction);
    return !(getEnvironment().canMove(xAhead, yAhead));
}