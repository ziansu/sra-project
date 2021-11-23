boolean release() {
    if ((currentPlayer) != null) {
        currentPlayer.reset();
        currentPlayer.release();
        currentPlayer = null;
        context = null;
        android.util.Log.d(com.huhx0015.hxaudio.audio.HXMusicEngine.LOG_TAG, "RELEASE: release(): MediaPlayer object has been released.");
        return true;
    }else {
        android.util.Log.e(com.huhx0015.hxaudio.audio.HXMusicEngine.LOG_TAG, "ERROR: release(): MediaPlayer object is null and cannot be released.");
        return false;
    }
}