public void pause() {
    android.util.Log.d(TagConstants.TAG, "pause");
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
}