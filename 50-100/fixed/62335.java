@com.squareup.otto.Subscribe
public void onTrackSelectedFromFilesEvent(org.qstuff.qplayer.events.TrackSelectedFromFilesEvent event) {
    timber.log.Timber.d(("onTrackSelectedFromFilesEvent(): " + (event.track.getName())));
    tracks = restoreTrackList(Constants.PREFS_KEY_QUEUE_TRACKLIST);
    if ((tracks) == null)
        return ;
    
    trackNames = getTrackNames(tracks);
    queueListAdapter = new org.qstuff.qplayer.ui.content.TrackListIndexerArrayAdapter(getActivity(), R.layout.tracklist_item, R.id.tracklist_item_text, trackNames);
    listView.setAdapter(null);
    listView.setAdapter(queueListAdapter);
}