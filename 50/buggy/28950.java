public boolean hasPath(int x1, int y1, int x2, int y2, boolean asSpace) {
    return com.mygdx.game.world.Map.hasPath(x1, y1, x2, y2, asSpace, copyAreSpaces());
}