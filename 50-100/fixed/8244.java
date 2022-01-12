public com.potatoes.cultivation.logic.Tile getTile(com.potatoes.cultivation.logic.GameMap gameMap) {
    if (((((i()) >= 0) && ((i()) < (gameMap.map.length))) && ((j) >= 0)) && ((j) < (gameMap.map[0].length)))
        return gameMap.map[i()][j];
    
    return null;
}