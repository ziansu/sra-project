public edu.chl.proximity.Utilities.ProximityVector getWaypoint(int waypointNumber) {
    if ((waypoints) != null) {
        if ((waypoints.size()) > waypointNumber) {
            return waypoints.get(waypointNumber);
        }
        return waypoints.get(((waypoints.size()) - 1));
    }
    return null;
}