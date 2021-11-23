@java.lang.Override
public void clearMap() {
    for (org.geotools.map.FeatureLayer layer : _gtLayers) {
        _myMap.removeLayer(layer);
    }
    _gtLayers.clear();
}