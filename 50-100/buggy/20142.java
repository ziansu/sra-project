private boolean nextToEnemy(int myID, GameMap gameMap) {
    for (int y = 0; y < (gameMap.height); y++) {
        for (int x = 0; x < (gameMap.width); x++) {
            final Location location = gameMap.getLocation(x, y);
            final Site site = location.getSite();
            if (2 == (getDistance(nearestEnemy(location, myID, gameMap)))) {
                return true;
            }
        }
    }
    return false;
}