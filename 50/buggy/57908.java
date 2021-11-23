private void cleanUpFromJosmFixture() {
    org.openstreetmap.josm.Main.getLayerManager().resetState();
    org.openstreetmap.josm.Main.pref = null;
    org.openstreetmap.josm.Main.platform = null;
    Main.pref.put("osm-server.url", "invalid-server");
    java.lang.System.gc();
}