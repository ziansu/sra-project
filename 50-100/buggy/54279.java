public int getDuration() {
    if ((exoPlayer) != null) {
        return (exoPlayer.getDuration()) == (-1L) ? 0 : ((int) (this.exoPlayer.getDuration()));
    }else {
        return (mediaPlayer.getDuration()) == (-1L) ? 0 : mediaPlayer.getDuration();
    }
}