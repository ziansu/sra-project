public void update() {
    position.setX(((position.getX()) + (velocity.getX())));
    position.setY(((position.getY()) + (velocity.getY())));
    velocity.setX(((velocity.getX()) + (acceleration.getX())));
    velocity.setY(((velocity.getY()) + (acceleration.getY())));
}