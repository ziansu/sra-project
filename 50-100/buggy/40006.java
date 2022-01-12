public de.blau.android.osm.BoundingBox getBounds() {
    de.blau.android.osm.BoundingBox result = null;
    boolean first = true;
    for (de.blau.android.osm.Node n : getNodes()) {
        if (first) {
            result = new de.blau.android.osm.BoundingBox(n.lon, n.lat);
        }else {
            result.union(n.lon, n.lat);
        }
    }
    return result;
}