public boolean isWallValid(holdup.Player player, int xPos, int yPos, holdup.Orientation orientation) {
    if (!(isExistingWallPlaced(xPos, yPos, orientation))) {
        if (playerHasZeroWalls(player)) {
            return false;
        }else {
            if ((placedWallList.size()) > 1) {
                return !(isWallBlockingPlayerPath(player, xPos, yPos, orientation));
            }else {
                return true;
            }
        }
    }else {
        return false;
    }
}