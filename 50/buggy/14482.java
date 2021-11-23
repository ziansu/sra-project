private synchronized void updateStart(kraken.pathfinding.dstarlite.gridspace.PointGridSpace p) {
    depart = getFromMemory(p);
    km += distanceHeuristique(lastDepart);
    lastDepart = depart.gridpoint;
    computeShortestPath();
}