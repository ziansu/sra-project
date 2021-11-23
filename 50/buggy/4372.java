public java.lang.String getWaypointCoordinate() {
    if ((waypointPosition) > 0)
        return ((20 - ((waypointPosition) / 15)) + ", ") + (((waypointPosition) % 15) + 1);
    else
        return "N/A";
    
}