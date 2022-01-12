public void zoomTo(int lonE7, int latE7, de.blau.android.osm.OsmElement e) {
    setFollowGPS(false);
    if ((e instanceof de.blau.android.osm.Node) && ((map.getZoomLevel()) < 22)) {
        android.util.Log.d(de.blau.android.Main.DEBUG_TAG, "zoomTosetting Zoom to 22");
        de.blau.android.Application.getLogic().setZoom(22);
    }else {
        map.getViewBox().setBorders(e.getBounds());
    }
    map.getViewBox().moveTo(lonE7, latE7);
}