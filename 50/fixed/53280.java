public void onSwipeProgress(float progress) {
    if ((mProgressListener) != null)
        mProgressListener.onSwipeProgress(getCurrentPosition(), progress);
    
    animateStackOnProgress(progress, false, 0);
}