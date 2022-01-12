public void play(java.lang.String track, boolean playedFromPlaylist) {
    try {
        shudder.model.Track t = new com.google.gson.Gson().fromJson(track, shudder.model.Track.class);
        control.open(new java.io.File(t.getPath()));
        control.play();
        currentSong = t;
        java.lang.System.out.println(("llego" + playedFromPlaylist));
        if (playedFromPlaylist) {
            java.lang.System.out.println("fue una cacion desde la playsit");
            getPosition(t);
        }
        playlistPlaying = playedFromPlaylist;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}