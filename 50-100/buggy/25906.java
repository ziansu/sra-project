private static com.google.maps.android.geojson.GeoJsonMultiPolygon createGeoJsonMultiPolygon(com.vividsolutions.jts.geom.MultiPolygon geometry, com.google.android.gms.maps.Projection projection) {
    java.util.List<com.google.maps.android.geojson.GeoJsonPolygon> polygonList = new java.util.ArrayList<>();
    for (int i = 0; i < (geometry.getNumGeometries()); i++) {
        polygonList.add(((com.google.maps.android.geojson.GeoJsonPolygon) (at.jku.cis.radar.convert.GeometryTransformator.transformToGeoJsonGeometry(geometry.getGeometryN(i), projection))));
    }
    return new com.google.maps.android.geojson.GeoJsonMultiPolygon(polygonList);
}