public java.lang.String getWaypointCoordinate() {
    if ((waypointPosition) > 0)
        return ((((waypointPosition) % 15) + 1) + ", ") + (20 - ((waypointPosition) / 15));
    else
        return "N/A";
    
}