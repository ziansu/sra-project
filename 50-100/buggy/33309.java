public void startSeeking() throws java.io.IOException {
    android.util.Log.d(com.tanosys.videolibrary.VideoDecoder.TAG, "start seeking");
    setState(com.tanosys.videolibrary.STATE_STOPPED);
    prepare();
    setState(com.tanosys.videolibrary.STATE_SEEKING);
    mInputDone = mOutputDone = false;
    mSeekDirection = com.tanosys.videolibrary.VideoDecoder.SEEK_DIRECTION_FORWARD;
    mMediaCodec.start();
    mSeekTargetTime = mExtractor.getSampleTime();
    mExtractor.seekTo(mSeekTargetTime, MediaExtractor.SEEK_TO_PREVIOUS_SYNC);
    mIsSeeking = true;
    new java.lang.Thread(mSeekRunnable, getClass().getSimpleName()).start();
}