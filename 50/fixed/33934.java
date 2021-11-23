public void setBrickType(de.bricked.game.bricks.BrickType brickType) {
    this.brickType = brickType;
    setText(((this.brickType.getID()) + (this.powerUpType.getID())));
}