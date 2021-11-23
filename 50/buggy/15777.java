private void changePlayerOfTower(int x, int y, int newPlayer) {
    jsettlers.common.position.ShortPoint2D pos = new jsettlers.common.position.ShortPoint2D(x, y);
    grid.changePlayerOfTower(pos, ((byte) (newPlayer)), getGroundArea(pos));
}