public void indexWay(long wayId, com.conveyal.osmlib.Way way) {
    com.conveyal.osmlib.WebMercatorTile tile = tileForWay(wayId, way);
    if (way == null) {
        com.conveyal.osmlib.OSM.LOG.debug("Attempted insert way {} into the spatial index, but it is not currently in the database.", wayId);
    }else {
        this.index.add(new org.mapdb.Fun.Tuple3(tile.xtile, tile.ytile, wayId));
    }
}