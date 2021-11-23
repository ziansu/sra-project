@com.squareup.otto.Subscribe
public void onTrackSelectedFromFilesEvent(org.qstuff.qplayer.events.TrackSelectedFromFilesEvent event) {
    timber.log.Timber.d(("onTrackSelectedFromFilesEvent(): " + (event.track.getName())));
    int trackIndex = org.qstuff.qplayer.util.TrackUtils.trackListContainsTrack(trackList, event.track);
    if (trackIndex < 0) {
        trackList.add(0, event.track);
        trackIndex = 0;
    }
    saveTrackList(Constants.PREFS_KEY_QUEUE_TRACKLIST, trackList);
    loadTrack(trackIndex);
    shallPlayImmediately = false;
}