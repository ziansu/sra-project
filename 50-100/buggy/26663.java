public void crashedYPos() {
    collisionRect.x = this.xPos;
    collisionRect.y = this.yPos;
    int tempVelocity = 1 + (generator.nextInt(3));
    setyVelocity((((-1) * tempVelocity) * (getyVelocity())));
    xPos = (xPos) + (xVelocity);
    yPos = (yPos) + (yVelocity);
}