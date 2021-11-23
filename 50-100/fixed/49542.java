private void setupMoving(java.awt.Point direction) {
    movingDestination = new java.awt.Point(((game.getZeroPos().x) + (direction.x)), ((game.getZeroPos().y) + (direction.y)));
    startTime = getTime();
    movingDirection = direction;
}