public com.nano.karen.SpotifyStreamer.TrackListItem selectNextTrack() {
    if ((curTrackIndex) == ((MAX_TRACK) - 1))
        curTrackIndex = 0;
    else
        (curTrackIndex)++;
    
    return mTracksAdapter.getItem(curTrackIndex);
}