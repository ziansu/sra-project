public void setLayers(final java.util.List<org.gwtopenmaps.openlayers.client.layer.Layer> vectorLayers) {
    layers = new java.util.ArrayList<org.geowe.client.local.main.VectorLayerInfo>();
    for (final org.gwtopenmaps.openlayers.client.layer.Layer layer : vectorLayers) {
        final org.geowe.client.local.main.VectorLayerInfo layerInfo = new org.geowe.client.local.main.VectorLayerInfo(((org.gwtopenmaps.openlayers.client.layer.Vector) (layer)));
        layers.add(layerInfo);
    }
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_STORE_1.clear();
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_STORE_1.addAll(layers);
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_COMBO_1.redraw();
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_STORE_2.clear();
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_STORE_2.addAll(layers);
    org.geowe.client.local.main.tool.spatial.geoprocess.dialog.GeoprocessDialog.LAYER_COMBO_2.redraw();
}