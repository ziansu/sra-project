public void changeWaypoint(int taskIndex, int waypointIndex, com.droneemployee.client.common.Coordinate newCoordinate) {
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        tasks.get(taskIndex).setWaypoint(waypointIndex, newCoordinate);
        observer.updateWaypoint(taskIndex, waypointIndex, newCoordinate);
    }
}