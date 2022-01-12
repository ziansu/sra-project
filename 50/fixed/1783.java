private void savePlayback() {
    ipv.stop();
    if ((player) != null) {
        control.setBackgroundResource(R.drawable.ic_media_play);
        player.setPlayWhenReady(false);
    }
}