private void closeWindow() {
    if ((mapView) != null) {
        mapFrame.removeView(mapView);
    }
    if (((mPluginLayout) != null) && ((mapDivLayoutJSON) != null)) {
        mPluginLayout.attachMyView(mapView);
        mPluginLayout.updateViewPosition();
    }
    root.removeView(windowLayer);
    mapFrame.destroyDrawingCache();
    mapFrame = null;
    windowLayer.destroyDrawingCache();
    windowLayer = null;
    this.onMapEvent("map_close");
}