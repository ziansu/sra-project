public void btnStopTrackingOnClick(android.view.View v) {
    trackingManager.stopTracking(true);
    com.spoiledmilk.ibikecph.persist.Track t = trackingManager.getLocationsAsTrack();
    android.util.Log.d("JC", ("Stopped tracking, got number of points: " + (t.getLocations().size())));
    realm.beginTransaction();
    com.spoiledmilk.ibikecph.persist.Track track = realm.createObject(com.spoiledmilk.ibikecph.persist.Track.class);
    track.setLocations(t.getLocations());
    realm.commitTransaction();
    getTracks();
    this.updateStrings();
}