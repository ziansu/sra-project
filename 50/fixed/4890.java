@java.lang.Override
public void doCommand() {
    for (com.google.maps.android.geojson.GeoJsonFeature feature : removeList) {
        geoJsonLayer.removeFeature(feature);
    }
    for (com.google.maps.android.geojson.GeoJsonFeature feature : addList) {
        geoJsonLayer.addFeature(feature);
    }
}