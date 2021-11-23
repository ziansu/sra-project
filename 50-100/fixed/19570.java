public boolean canRobPlayer(shared.locations.HexLocation hexLoc, int playerId) {
    if (playerId == (-1))
        return true;
    
    for (shared.data.Location location : locationManager.getSettledLocations()) {
        if ((location.getOwnerID()) == playerId) {
            java.util.List<shared.locations.HexLocation> hexes = locationManager.getHexLocationsAroundVertexLocation(location.getNormalizedLocation());
            for (shared.locations.HexLocation hex : hexes) {
                if (hexLoc.equals(hex)) {
                    return true;
                }
            }
        }
    }
    return false;
}