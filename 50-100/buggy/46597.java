public long[][] getCoverageIntersections(org.geowebcache.grid.BoundingBox reqBounds) {
    final int zoomStart = getZoomStart();
    final int zoomStop = getZoomStop();
    long[][] ret = new long[(1 + zoomStop) - zoomStart][5];
    for (int level = zoomStart; level <= zoomStop; level++) {
        ret[level] = getCoverageIntersection(level, reqBounds);
    }
    return ret;
}