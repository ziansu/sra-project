public boolean isObstacleInDirection(languagelearning.agents.Direction direction) {
    int xAhead = getNewXInDirection(getDirection());
    int yAhead = getNewYInDirection(getDirection());
    return !(getEnvironment().canMove(xAhead, yAhead));
}