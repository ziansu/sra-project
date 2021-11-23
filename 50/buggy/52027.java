private void preTickMove() {
    shouldRenderMove = true;
    brownshome.scriptwars.game.tanks.Coordinates newCoord = direction.move(position);
    if (world.isWall(newCoord)) {
        clearAction();
        return ;
    }
    position = newCoord;
}