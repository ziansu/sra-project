public void removeGraphicsLayer() {
    if ((mGraphicsLayer) != null) {
        mMapView.removeLayer(mGraphicsLayer);
        mGraphicsLayer = null;
    }
}