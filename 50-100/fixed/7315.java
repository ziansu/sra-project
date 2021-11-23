public boolean isStarBaseDeployed() {
    if (((ships.size()) <= 7) && ((ships.size()) > 0)) {
        org.openRealmOfStars.player.ship.Ship ship = ships.get(0);
        if ((ship.isStarBase()) && (ship.getFlag(Ship.FLAG_STARBASE_DEPLOYED))) {
            return true;
        }
    }
    return false;
}