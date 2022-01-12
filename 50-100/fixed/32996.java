public void setBattleShips(gameData.Battleship[] battleShips) {
    this.battleships = battleShips;
    for (gameData.Battleship battleship : battleShips) {
        for (gameData.Tile occupiedTile : battleship.getOccupiedTiles()) {
            this.updateTileStatus(Tile.SHIP_COVERED_TILE, new java.awt.Point(occupiedTile.getX(), occupiedTile.getY()), battleship);
        }
    }
}