private void updateJukeboxAll(com.vibejukebox.jukebox.JukeboxObject jukebox) {
    if (com.vibejukebox.jukebox.service.VibeService.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.service.VibeService.TAG, " -- update ALL --");
    
    final com.parse.ParseGeoPoint geoPoint = getGeoPointFromMyLocation(mLocation);
    if (geoPoint == null) {
        android.util.Log.e(com.vibejukebox.jukebox.service.VibeService.TAG, "An error occurred getting the current location");
    }
    jukebox.put("name", mPlaylistName);
    jukebox.put("location", geoPoint);
    jukebox.put("queueSongIDs", mTrackUris);
    jukebox.put("defaultQueueSongIDs", mTrackUris);
    saveInBackground(jukebox);
    mHandler.sendEmptyMessage(com.vibejukebox.jukebox.service.VibeService.VIBE_JUKEBOX_OBJECT_CREATION_DONE);
}