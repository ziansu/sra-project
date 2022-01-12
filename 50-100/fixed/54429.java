public void spreadToLowest(worlds.planet.cells.PlanetCell spreadFrom) {
    int maxCellCount;
    if (!(spreadFrom.hasOcean())) {
        maxCellCount = 8;
    }else {
        maxCellCount = 3;
    }
    java.util.ArrayList<engine.util.Point> lowestList = new java.util.ArrayList<>(maxCellCount);
    getLowestCells(spreadFrom, lowestList, maxCellCount);
    spread(lowestList, spreadFrom);
}