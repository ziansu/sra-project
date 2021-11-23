private void crashedXPos() {
    collisionRect.x = this.xPos;
    collisionRect.y = this.yPos;
    setxVelocity((1 * (getxVelocity())));
    xPos = (xPos) + (xVelocity);
    yPos = (yPos) + (yVelocity);
}