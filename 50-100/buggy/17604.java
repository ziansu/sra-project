public void update() {
    position.setX(((velocity.getX()) + (velocity.getX())));
    position.setY(((velocity.getY()) + (velocity.getY())));
    velocity.setX(((velocity.getX()) + (acceleration.getX())));
    velocity.setY(((velocity.getY()) + (acceleration.getY())));
}