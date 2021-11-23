private void playSound(float distance) {
    if (!(mediaReady)) {
        return ;
    }
    if (mp.isPlaying()) {
    }
    try {
        int maxDistance = 3;
        float volume = 1 - ((java.lang.Math.min(distance, 5)) / maxDistance);
        android.util.Log.i("AUDIO", ("Setting volume to " + volume));
        mp.setVolume(volume, volume);
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
}