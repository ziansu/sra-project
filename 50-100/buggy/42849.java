private com.vividsolutions.jts.geom.Geometry geometry(de.topobyte.osm4j.geometry.WayBuilderResult result) {
    com.vividsolutions.jts.geom.Coordinate[] coordinates = result.getCoordinates().toArray(new com.vividsolutions.jts.geom.Coordinate[0]);
    com.vividsolutions.jts.geom.LineString[] lineStrings = result.getLineStrings().toArray(new com.vividsolutions.jts.geom.LineString[0]);
    if ((result.getLinearRing()) == null) {
        return de.topobyte.osm4j.geometry.GeometryUtil.createGeometry(coordinates, lineStrings, result.getLinearRing(), factory);
    }else {
        return de.topobyte.osm4j.geometry.GeometryUtil.createGeometry(coordinates, lineStrings, factory);
    }
}