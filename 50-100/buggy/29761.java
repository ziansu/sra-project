public com.unimelb.swen30006.partc.planning.Route getRoute(java.awt.geom.Point2D.Double departurePosition) {
    com.unimelb.swen30006.partc.roads.Road currentRoad = map.findRoad(departurePosition);
    com.unimelb.swen30006.partc.roads.Road destinationRoad = map.findRoad(this.destination);
    if (destinationRoad == null) {
        return null;
    }
    com.unimelb.swen30006.partc.planning.Route route = calculateBestRoute(currentRoad, destinationRoad);
    return route;
}