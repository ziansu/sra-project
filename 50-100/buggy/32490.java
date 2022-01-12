@org.junit.Test
public void importNoTagsTest() {
    java.io.File image = new java.io.File(((MapillaryPlugin.directory) + "images/icon16.png"));
    org.openstreetmap.josm.plugins.mapillary.MapillaryImportedImage img = MapillaryPlugin.importAction.readNoTags(image, new org.openstreetmap.josm.data.coor.LatLon(0, 0));
    assertEquals(0, img.getCa(), 0.01);
    assert Main.map.mapView.getRealBounds().getCenter().equalsEpsilon(img.getLatLon());
}