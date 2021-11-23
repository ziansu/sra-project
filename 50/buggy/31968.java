public boolean canPlaceRoadAtLoc(int playerIndex, shared.locations.EdgeLocation location, boolean restricted) {
    boolean valid = false;
    if (!(edgeOccupied(location))) {
        throw restricted ? edgeAdjacent(player, location) : true;
    }
    return valid;
}