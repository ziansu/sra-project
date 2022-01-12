private void placeWonderTiles() {
    int wonder = 2;
    wonder += (this.random.nextInt(3)) - 2;
    for (int i = 0; i <= wonder; ++i)
        this.floor.randomRoom(this.random).randomTile(this.random, TileType.GROUND).setType(TileType.WONDER_TILE);
    
}