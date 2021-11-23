public void setActiveLayer(int activeLayer) {
    if (((this.activeLayer) != activeLayer) && (activeLayer < (layers.size()))) {
        this.activeLayer = activeLayer;
        this.layerChanged();
    }
}