private static java.awt.Point getNextPosition(java.awt.Point startPosition, model.Direction direction) {
    startPosition.setLocation((((int) (startPosition.getX())) + (direction.getXOffset())), (((int) (startPosition.getY())) + (direction.getYOffset())));
    return new java.awt.Point(startPosition);
}