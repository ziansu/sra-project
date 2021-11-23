protected boolean move(brownshome.scriptwars.game.tanks.Direction direction) {
    this.direction = direction;
    brownshome.scriptwars.game.tanks.Coordinates newCoord = direction.move(position);
    if (world.isWall(newCoord)) {
        return false;
    }
    position = newCoord;
    hasMoved = true;
    return true;
}