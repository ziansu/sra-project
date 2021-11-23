private void setPathGlobal(courier.Station from, courier.Station to) {
    courier.TramLine tl = map.tramLines.get(0);
    courier.Station currStation = currStation();
    if ((globalPath) == null) {
        globalPath = tl.getPathGlobal(from, to);
    }
    if ((globalPath) == null) {
        stationTo = currStation;
    }else {
        stationTo = globalPath.get(((globalPath.indexOf(currStation)) + 1));
    }
}