public void play(java.util.ArrayList<com.example.manuelsanchez.spotifystreamer.model.ArtistTopTrackItem> topTrackItems, int trackIndex) {
    if ((((tracks) == null) || (!(isTrackCurrentlyPlaying(tracks, trackIndex)))) || (playbackState.equals(PlaybackState.IDLE))) {
        tracks = topTrackItems;
        currentIndex = trackIndex;
        initializeMediaPlayer();
    }else
        if (playbackState.equals(PlaybackState.PAUSED)) {
            mMediaPlayer.start();
            fireStatusChangeEvent(com.example.manuelsanchez.spotifystreamer.SpotifyStreamerConstants.ACTION_PLAY);
        }
    
    playbackState = PlaybackState.PLAY;
}