private java.util.List<com.thinkaurelius.titan.diskstorage.solr.Geoshape.Point> getPolygonPoints(com.thinkaurelius.titan.diskstorage.solr.Geoshape polygon) {
    java.util.List<com.thinkaurelius.titan.diskstorage.solr.Geoshape.Point> locations = new java.util.ArrayList<com.thinkaurelius.titan.diskstorage.solr.Geoshape.Point>();
    int index = 0;
    boolean hasCoordinates = true;
    while (hasCoordinates) {
        try {
            locations.add(polygon.getPoint(index));
        } catch (java.lang.ArrayIndexOutOfBoundsException ignore) {
            hasCoordinates = false;
        }
    } 
    return locations;
}