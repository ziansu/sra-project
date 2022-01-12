private void startPlaying() {
    mPlayer = new android.media.MediaPlayer();
    try {
        mPlayer.setDataSource(mFilename);
        mPlayer.setLooping(true);
        mPlayer.prepare();
        mPlayer.start();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.pham.looper.PlayButton.LOG_TAG, "prepare() failed");
    }
    mStartPlaying = !(mStartPlaying);
    setText("Stop playing");
}