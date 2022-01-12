public void pauseMedia() {
    if ((mediaPlayer) == null)
        return ;
    
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
        resumePosition = mediaPlayer.getCurrentPosition();
    }
}