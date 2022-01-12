private com.google.maps.android.geojson.GeoJsonMultiPolygon createComplexPolygon(com.vividsolutions.jts.geom.Polygon polygon, com.google.android.gms.maps.Projection projection) {
    java.util.List<com.vividsolutions.jts.geom.Polygon> polygons = at.jku.cis.radar.service.JTSUtils.repair(polygon);
    com.vividsolutions.jts.geom.MultiPolygon multiPolygon = new com.vividsolutions.jts.geom.GeometryFactory().createMultiPolygon(polygons.toArray(new com.vividsolutions.jts.geom.Polygon[polygons.size()]));
    com.google.maps.android.geojson.GeoJsonMultiPolygon geoJsonPolygon = ((com.google.maps.android.geojson.GeoJsonMultiPolygon) (at.jku.cis.radar.convert.GeometryTransformator.transformToGeoJsonGeometry(multiPolygon)));
    return geoJsonPolygon;
}