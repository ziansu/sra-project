private double computeHeurisitc(final TerrainMap pMap, final java.awt.Point pCurrentPoint) {
    double lDistance = pCurrentPoint.distance(pMap.getEndPoint());
    double lHeightDifference = (pMap.getTile(pMap.getEndPoint())) - (pMap.getTile(pCurrentPoint));
    double lOneStep = lHeightDifference / lDistance;
    return lDistance * (java.lang.Math.exp(lOneStep));
}