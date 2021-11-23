@java.lang.Override
public void handle(fredboat.audio.queue.MarkerState state) {
    fredboat.audio.queue.TrackEndMarkerHandler.log.info(((("Stopping track " + (track.getEffectiveTitle())) + " because of end state: ") + state));
    if (((player.getPlayingTrack()) != null) && ((player.getPlayingTrack().getId()) == (track.getId()))) {
        if (state.equals(MarkerState.REACHED))
            player.splitTrackEnded();
        else
            player.skip();
        
    }
}