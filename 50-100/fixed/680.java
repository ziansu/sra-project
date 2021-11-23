@com.squareup.otto.Subscribe
public void onAddTrackListToQueueEvent(org.qstuff.qplayer.events.AddTrackListToQueueEvent event) {
    timber.log.Timber.d(("onAddTrackListToQueueEvent(): num " + (event.tracks.size())));
    tracks.addAll(event.tracks);
    trackNames.addAll(getTrackNames(event.tracks));
    queueListAdapter = new org.qstuff.qplayer.ui.content.TrackListIndexerArrayAdapter(getActivity(), R.layout.tracklist_item, R.id.tracklist_item_text, trackNames);
    listView.setAdapter(null);
    listView.setAdapter(queueListAdapter);
    bus.post(new org.qstuff.qplayer.events.PlayQueueUpdateEvent(tracks, true, false, false));
    saveTrackList(Constants.PREFS_KEY_QUEUE_TRACKLIST, tracks);
}