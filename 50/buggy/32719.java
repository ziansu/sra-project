public gameLogic.map.Station getStationFromPosition(gameLogic.map.IPositionable position) {
    for (gameLogic.map.Station station : stations) {
        if (station.getLocation().equals(position)) {
            return station;
        }
    }
    throw new java.lang.RuntimeException("Station does not exist for that position");
}