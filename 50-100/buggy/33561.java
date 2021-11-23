@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    this.mMediaPlayer.stop();
    this.mMediaPlayer.release();
    this.mSoundPool.release();
    if (null != (tts)) {
        tts.shutdown();
    }
}