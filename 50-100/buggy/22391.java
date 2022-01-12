public void crashedBlock() {
    collisionRect.x = this.xPos;
    collisionRect.y = this.yPos;
    setyVelocity(((-1) * (getyVelocity())));
    setxVelocity(((-1) * (getxVelocity())));
    xPos = (xPos) + (xVelocity);
    yPos = (yPos) + (yVelocity);
}