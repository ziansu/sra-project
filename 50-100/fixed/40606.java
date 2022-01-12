public void turnOnMusic() {
    if ((mp) == null) {
        mp = new android.media.MediaPlayer();
        songManager = new nit.in.audiosense.SongsManager();
        mp.setOnCompletionListener(this);
        songsList = songManager.getPlayList();
        java.util.Random rand = new java.util.Random();
        currentSongIndex = (rand.nextInt(((((songsList.size()) - 1) - 0) + 1))) + 0;
        playSong(currentSongIndex);
    }
}