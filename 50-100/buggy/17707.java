private void closeWindow() {
    mapFrame.removeView(mapView);
    if (((mPluginLayout) != null) && ((mapDivLayoutJSON) != null)) {
        mPluginLayout.attachMyView(mapView);
        mPluginLayout.updateViewPosition();
    }
    root.removeView(windowLayer);
    windowLayer.destroyDrawingCache();
    windowLayer = null;
    this.onMapEvent("map_close");
}