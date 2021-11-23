public void play(java.lang.String track, boolean playedFromPlaylist) {
    try {
        shudder.model.Track t = new com.google.gson.Gson().fromJson(track, shudder.model.Track.class);
        currentSong = t;
        control.open(new java.io.File(t.getPath()));
        control.play();
        control.setGain(volume);
        if (playedFromPlaylist) {
            getPosition(t);
        }
        playlistPlaying = playedFromPlaylist;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}