private boolean nextToEnemy(GameMap gameMap) {
    for (int y = 0; y < (gameMap.height); y++) {
        for (int x = 0; x < (gameMap.width); x++) {
            final Location location = gameMap.getLocation(x, y);
            final Site site = location.getSite();
            if (1 == (getDistance(nearestEnemy(location)))) {
                return true;
            }
        }
    }
    return false;
}