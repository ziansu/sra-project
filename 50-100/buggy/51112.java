public int getCurrentPosition() {
    if ((exoPlayer) != null) {
        return (exoPlayer.getDuration()) == (-1L) ? 0 : ((int) (exoPlayer.getCurrentPosition()));
    }else {
        return (mediaPlayer.getDuration()) == (-1L) ? 0 : mediaPlayer.getCurrentPosition();
    }
}