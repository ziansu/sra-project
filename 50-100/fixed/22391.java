public void crashedBlock() {
    collisionRect.x = this.xPos;
    collisionRect.y = this.yPos;
    setyVelocity(((-1) * (getyVelocity())));
    xPos = (xPos) + (xVelocity);
    yPos = (yPos) + (yVelocity);
}