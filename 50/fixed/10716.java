public void playSong(com.wojtechnology.sunami.FireMixtape song) {
    mOuterLayout.playSong(song);
    mOuterLayout.setProgress(mTheBrain.mMediaPlayer.getCurrentPosition());
}