protected int getNumDataLayers() {
    if (!(org.openstreetmap.josm.Main.isDisplayingMapView()))
        return 0;
    
    int count = 0;
    java.util.Collection<org.openstreetmap.josm.gui.layer.Layer> layers = Main.map.mapView.getAllLayers();
    for (org.openstreetmap.josm.gui.layer.Layer layer : layers) {
        if (layer instanceof org.openstreetmap.josm.gui.layer.OsmDataLayer) {
            count++;
        }
    }
    return count;
}