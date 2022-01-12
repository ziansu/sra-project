public void pausePlay() {
    if ((videoPlayer) == null) {
        return ;
    }
    small_Play_bt.setImageResource(R.drawable.zanting);
    videoPlayer.pause();
}