@com.marverenic.music.utils.Internal
void onPositionDiscontinuity() {
    if ((mQueue.size()) == 0) {
        return ;
    }
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