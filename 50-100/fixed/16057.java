public void btnStopTrackingOnClick(android.view.View v) {
    trackingManager.stopTracking(true);
    com.spoiledmilk.ibikecph.persist.Track t = trackingManager.getLocationsAsTrack();
    android.util.Log.d("JC", ("Stopped tracking, got number of points: " + (t.getLocations().size())));
    getTracks();
    this.updateStrings();
}