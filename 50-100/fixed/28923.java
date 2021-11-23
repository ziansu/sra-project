private void updatePosition(double delta) {
    position.setX(((position.getX()) + ((delta * (speed)) * (java.lang.Math.cos(direction)))));
    position.setY(((position.getY()) - ((delta * (speed)) * (java.lang.Math.sin(direction)))));
}