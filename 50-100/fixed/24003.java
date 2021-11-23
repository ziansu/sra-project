public gameLogic.map.Station getNextStation() {
    gameLogic.map.Station last = getLastStation();
    for (int i = 0; i < ((route.size()) - 1); i++) {
        gameLogic.map.Station station = route.get(i);
        if (last.getName().equals(station.getName())) {
            return route.get((i + 1));
        }
    }
    return null;
}