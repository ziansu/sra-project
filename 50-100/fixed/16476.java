public com.TeamHEC.LocomotionCommotion.Map.Station getStationWithName(java.lang.String name) {
    com.TeamHEC.LocomotionCommotion.Map.Station[] stations = stationList();
    for (int i = 0; i < (stations.length); i++) {
        if (stations[i].getName().equals(name)) {
            return stations[i].getStation();
        }
    }
    return null;
}