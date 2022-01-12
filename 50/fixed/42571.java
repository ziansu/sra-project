public void setActiveLayer(int activeLayer) {
    if ((this.activeLayer) != activeLayer) {
        this.activeLayer = activeLayer;
        this.layerChanged();
    }
}