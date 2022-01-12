public edu.chl.proximity.Utilities.ProximityVector getWaypoint(int waypointNumber) {
    if ((waypoints) != null) {
        if (((waypoints.size()) > waypointNumber) && (waypointNumber >= 0)) {
            return waypoints.get(waypointNumber);
        }
        if (waypointNumber >= (waypoints.size())) {
            return waypoints.get(((waypoints.size()) - 1));
        }
        return waypoints.get(0);
    }
    return null;
}