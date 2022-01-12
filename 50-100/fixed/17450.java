public void moveLeft(int delta) {
    if ((xVelocity) > (-(maximumSpeed))) {
        xVelocity -= (accelerationSpeed) * delta;
        if ((xVelocity) > (-(maximumSpeed))) {
            xVelocity = -(maximumSpeed);
        }
    }
    moving = true;
    facing = game.enums.Facing.LEFT;
}