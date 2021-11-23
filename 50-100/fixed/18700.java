public void playSong(shudder.model.Track t, boolean playedFromPlaylist) {
    try {
        control.open(new java.io.File(t.getPath()));
        control.play();
        currentSong = t;
        if (playedFromPlaylist) {
            getPosition(t);
        }
        playlistPlaying = playedFromPlaylist;
    } catch (java.lang.Exception ex) {
        java.lang.System.err.print(ex.getMessage());
    }
}