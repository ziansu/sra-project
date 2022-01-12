public void createGame() {
    tilePlacements = new GameEngine.Tile[(size) * (size)];
    for (int i = 0; i < ((tilePlacements.length) - 1); i++) {
        tilePlacements[i] = new GameEngine.Tile((i + 1), java.awt.Color.blue, getPosition(i));
    }
    voidTilePosition = new java.awt.Point(((size) - 1), ((size) - 1));
}