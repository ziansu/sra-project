public void setMaxVolume(float maxVolume) {
    this.maxVolume = maxVolume;
    leftVolume = maxVolume;
    rightVolume = maxVolume;
    oscillatingDown = true;
    initialVolume = maxVolume;
    mp.setVolume(maxVolume, maxVolume);
    android.util.Log.d(dalbers.com.noise.AudioPlayerService.LOG_TAG, java.lang.Float.toString(maxVolume));
}