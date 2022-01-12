public boolean placeTile(int x, int y, com.github.antag99.aquarria.tile.TileType type, com.github.antag99.aquarria.entity.PlayerEntity player) {
    if ((getTileType(x, y)) == (com.github.antag99.aquarria.tile.TileType.air)) {
        setTileType(x, y, type);
        checkAttachment(x, y, player);
        return true;
    }
    return false;
}