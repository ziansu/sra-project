@com.squareup.otto.Subscribe
public void onTrackSelectedFromQueueEvent(org.qstuff.qplayer.events.TrackSelectedFromQueueEvent event) {
    timber.log.Timber.d(("onTrackSelectedFromQueueEvent(): " + (event.track.getName())));
    int trackIndex;
    if (!(org.qstuff.qplayer.util.TrackUtils.trackListContainsTrack(trackList, event.track))) {
        trackList.add(0, event.track);
        trackIndex = 0;
    }else {
        trackIndex = trackList.indexOf(event.track);
    }
    loadTrack(trackIndex);
    shallPlayImmediately = false;
}