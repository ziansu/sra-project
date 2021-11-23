@com.marverenic.music.utils.Internal
void onPositionDiscontinuity() {
    if ((mQueue.size()) == 0) {
        return ;
    }
    int currentQueueIndex = (mExoPlayer.getCurrentWindowIndex()) % (mQueue.size());
    if (((mQueueIndex) != currentQueueIndex) || (mInvalid)) {
        onCompletion();
        if ((!(mRepeatOne)) && (!(mInvalid))) {
            mQueueIndex = currentQueueIndex;
            onStart();
        }
    }
}