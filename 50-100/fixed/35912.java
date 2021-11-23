public com.khasang.forecast.position.Position getPosition(int cityID) {
    if (cityID == 0) {
        return currentLocation;
    }
    for (com.khasang.forecast.position.Position pos : positions.values()) {
        if ((pos.getCityID()) == cityID) {
            return pos;
        }
    }
    return null;
}