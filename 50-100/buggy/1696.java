public void crashedXPos() {
    collisionRect.x = this.xPos;
    collisionRect.y = this.yPos;
    int tempVelocity = 1 + (generator.nextInt(6));
    setxVelocity((tempVelocity * (getxVelocity())));
    setxVelocity(((-1) * (getxVelocity())));
    xPos = (xPos) + (xVelocity);
    yPos = (yPos) + (yVelocity);
}