public static void create(java.util.Collection<java.io.File> files, org.openstreetmap.josm.gui.layer.GpxLayer gpxLayer) {
    org.openstreetmap.josm.gui.layer.geoimage.GeoImageLayer.Loader loader = new org.openstreetmap.josm.gui.layer.geoimage.GeoImageLayer.Loader(files, gpxLayer);
    Main.worker.execute(loader);
}