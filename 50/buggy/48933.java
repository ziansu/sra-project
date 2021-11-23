public void stopPlaying() {
    if (com.codingspezis.android.metalonly.player.BuildConfig.DEBUG)
        com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.LOGGER.debug("stopPlaying()");
    
    metadataListener.stop();
    timeoutListener.stop();
    com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.mediaPlayer.stop();
    com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.mediaPlayer.reset();
    releaseLocks();
}