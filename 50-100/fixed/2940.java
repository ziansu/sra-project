@com.squareup.otto.Subscribe
public void onTrackSelectedFromQueueEvent(org.qstuff.qplayer.events.TrackSelectedFromQueueEvent event) {
    timber.log.Timber.d(("onTrackSelectedFromQueueEvent(): " + (event.track.getName())));
    int trackIndex = org.qstuff.qplayer.util.TrackUtils.trackListContainsTrack(trackList, event.track);
    if (trackIndex < 0) {
        trackList.add(0, event.track);
        trackIndex = 0;
    }
    loadTrack(trackIndex);
    shallPlayImmediately = false;
}