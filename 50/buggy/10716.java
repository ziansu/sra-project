public void playSong(com.wojtechnology.sunami.FireMixtape song) {
    mOuterLayout.setProgress(mTheBrain.mMediaPlayer.getCurrentPosition());
    mOuterLayout.playSong(song);
}