@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
        mMediaPlayer.release();
    }
    if ((mSoundPool) != null) {
        mSoundPool.release();
    }
    if ((tts) != null) {
        tts.shutdown();
    }
}