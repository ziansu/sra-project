public void resumeMedia() {
    if ((mediaPlayer) == null)
        return ;
    
    if (!(mediaPlayer.isPlaying())) {
        mediaPlayer.seekTo(resumePosition);
        mediaPlayer.start();
    }
}