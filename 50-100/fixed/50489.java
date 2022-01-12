public void setYTiles(int yTiles) {
    if (yTiles > ((DungeonRoom.FLOOR_HEIGHT_IN_HALF_TILES) - (heightTiles))) {
        yTiles = (DungeonRoom.FLOOR_HEIGHT_IN_HALF_TILES) - (heightTiles);
    }
    this.yTiles = yTiles;
    setY(((yTiles * ((MuscovyGame.HALF_TILE_SIZE) + 1)) + (MuscovyGame.TILE_SIZE)));
}