protected boolean move(brownshome.scriptwars.game.tanks.Direction direction) {
    this.direction = direction;
    brownshome.scriptwars.game.tanks.Coordinates newCoord = direction.move(position);
    brownshome.scriptwars.game.tanks.Tank tank = world.getTank(newCoord);
    if (tank != null) {
        if (tank.hasMoved) {
            world.addToRewindList(tank);
        }
        return false;
    }
    if (world.isWall(newCoord)) {
        return false;
    }
    position = newCoord;
    hasMoved = true;
    return true;
}