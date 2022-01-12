public boolean canPlayerBuyRoute(int playerID, model.CityToCityRoute route, java.util.Map<model.TrackColor, java.lang.Integer> cards) {
    if (!(gameBoard.isRouteAvailable(route))) {
        return false;
    }
    if (!(playerManager.canBuyTrack(playerID, route.getNumTrains()))) {
        return false;
    }
    if (playerManager.canBuyTrackWithCards(playerID, route.getNumTrains(), route.getTrackColor(), cards)) {
        return true;
    }
    return false;
}