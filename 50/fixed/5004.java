public boolean isPlaying() {
    if ((exoPlayer) != null) {
        return exoPlayer.getPlayWhenReady();
    }else
        if ((mediaPlayer) != null) {
            return mediaPlayer.isPlaying();
        }
    
    return false;
}