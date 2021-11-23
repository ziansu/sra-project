private void placeStairs() {
    com.darkxell.common.dungeon.floor.Room exitRoom = this.floor.randomRoom(this.random);
    exitRoom.randomTile(this.random).setType(TileType.STAIR);
}