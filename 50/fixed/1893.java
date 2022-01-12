public static void create(java.util.Collection<java.io.File> files, org.openstreetmap.josm.gui.layer.GpxLayer gpxLayer) {
    Main.worker.execute(new org.openstreetmap.josm.gui.layer.geoimage.GeoImageLayer.Loader(files, gpxLayer));
}