@java.lang.Override
public void dealPlayerTiles(final ca.concordia.lanternsentities.LakeTile[] totalTiles, final ca.concordia.lanternsentities.Player[] players) {
    int toAssign = 3 * (players.length);
    if ((totalTiles.length) > toAssign) {
        while (toAssign > 0) {
            for (ca.concordia.lanternsentities.Player player : players) {
                player.getTiles().add(totalTiles[(toAssign--)]);
            }
        } 
    }else {
        throw new java.lang.IllegalArgumentException("There are not enough tiles to be assigned!");
    }
}