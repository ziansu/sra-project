private void onPlayerStateChange(@org.bottiger.podcast.player.exoplayer.ExoPlayerWrapper.PlayerState
int argPlayerStatus) {
    if (!(getEpisode().equals(org.bottiger.podcast.SoundWaves.getAppContext(getContext()).getPlaylist().first()))) {
        setStatus(ExoPlayerWrapper.STATE_READY);
        return ;
    }
    setStatus(argPlayerStatus);
}