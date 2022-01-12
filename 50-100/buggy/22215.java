public void stopPanning() {
    if (!(mIsPanning))
        return ;
    
    mIsPanning = false;
    android.util.Log.d(com.maelstrom.panning.PanningImageViewAttacher.TAG, "Panning Animation stopped");
    if ((mCurrentAnimator) != null) {
        mCurrentAnimator.removeAllListeners();
        mCurrentAnimator.cancel();
        mCurrentAnimator = null;
    }
    mTotalTime += mCurrentPlayTime;
    android.util.Log.d(com.maelstrom.panning.PanningImageViewAttacher.TAG, ("mTotalTime : " + (mTotalTime)));
}