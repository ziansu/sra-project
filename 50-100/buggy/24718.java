public void checkWaypointLoaded() {
    if (currentWaypoint.getValue().isNullPosition()) {
        if ((pathWaypoints.getValue().size()) > 0) {
            currentWaypoint.setValue(pathWaypoints.getValue().get(0));
        }
    }
}