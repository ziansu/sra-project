public void removeLayer(build.games.wraithaven.iso.Layer layer) {
    layers.remove(layer);
    if ((selectedLayer) == layer) {
        if (layers.isEmpty()) {
            selectedLayer = null;
        }else {
            selectedLayer = layers.get(0);
        }
    }
    save(true);
    updatePreferedSize();
    repaint();
}