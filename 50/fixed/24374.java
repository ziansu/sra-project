private void addDynamicGraphicLayer() {
    mGraphicsLayer = new com.esri.android.map.GraphicsLayer();
    addLayer(mGraphicsLayer);
    mGraphicsLayerGGAdapter = new com.teamagam.gimelgimel.app.map.esri.GraphicsLayerGGAdapter(getContext(), mGraphicsLayer, com.teamagam.gimelgimel.app.map.esri.EsriGGMapView.WGS_84_GEO, getSpatialReference());
}