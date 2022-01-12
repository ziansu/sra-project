private com.google.maps.android.geojson.GeoJsonGeometry createGeoJsonPolygon(com.google.android.gms.maps.Projection projection) {
    com.google.maps.android.geojson.GeoJsonPolygon geoJsonPolygon = new com.google.maps.android.geojson.GeoJsonPolygon(createListOfCoordinates(coordinates));
    com.vividsolutions.jts.geom.Polygon polygon = ((com.vividsolutions.jts.geom.Polygon) (at.jku.cis.radar.convert.GeometryTransformator.transformToGeometry(geoJsonPolygon, projection)));
    if (polygon.isSimple()) {
        return geoJsonPolygon;
    }
    return createComplexPolygon(polygon, projection);
}