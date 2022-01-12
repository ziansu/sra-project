public languagelearning.states.LookAheadState getLookAheadState() {
    int xAhead = getNewXInDirection(getDirection());
    int yAhead = getNewYInDirection(getDirection());
    boolean dustAhead = (getEnvironment().getDustValue(xAhead, yAhead)) > 0;
    boolean obstacleAhead = !(getEnvironment().canMove(xAhead, yAhead));
    languagelearning.states.LookAheadState state = new languagelearning.states.LookAheadState(obstacleAhead, dustAhead);
    return state;
}