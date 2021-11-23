public gameLogic.map.Station getNextStation() {
    gameLogic.map.Station last = getLastStation();
    for (int i = 0; i < ((history.size()) - 1); i++) {
        gameLogic.map.Station station = route.get(i);
        if ((last.getName()) == (station.getName())) {
            return route.get((i + 1));
        }
    }
    return null;
}