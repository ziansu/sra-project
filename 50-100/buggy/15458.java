@com.marverenic.music.utils.Internal
void onPositionDiscontinuity() {
    int currentQueueIndex = (mExoPlayer.getCurrentWindowIndex()) % (mQueue.size());
    boolean invalid = mInvalid;
    if (((mQueueIndex) != currentQueueIndex) || invalid) {
        onCompletion();
        if ((!(mRepeatOne)) && (!invalid)) {
            mQueueIndex = currentQueueIndex;
            onStart();
        }
    }
}