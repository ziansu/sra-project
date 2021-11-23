private void breadCrumbs() {
    saveMap();
    FredFin.pop();
    currentLocation = FredFin.peek().getCoords();
    drawer.displayLevel(currentLocation[0]);
}